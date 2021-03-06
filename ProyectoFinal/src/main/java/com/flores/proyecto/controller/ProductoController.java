package com.flores.proyecto.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.flores.proyecto.model.Producto;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;


@Controller
public class ProductoController {

	
	@GetMapping("/productos")
	public String list(@ModelAttribute("SpringWeb") Producto product, ModelMap model) 
	{
		try {
			ClientConfig clientConfig = new DefaultClientConfig();
			clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING,Boolean.TRUE);
			Client client = Client.create(clientConfig);
			WebResource webResource = client.resource("https://fast-shop-jrgflores.c9users.io/productos");
			List<Producto> producto = webResource.get(new GenericType<List<Producto>>(){});
			model.addAttribute("productos", producto);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		  }
		return "productos/index";
	}
	
	@RequestMapping(value = "/productos", method = RequestMethod.GET,params="qa")
	public  String buscar(@ModelAttribute("SpringWeb") Producto product,@RequestParam("qa") String qa,  ModelMap model) {
		try {
			ClientConfig clientConfig = new DefaultClientConfig();
			clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING,Boolean.TRUE);
			Client client = Client.create(clientConfig);
			WebResource webResource = client.resource("https://fast-shop-jrgflores.c9users.io/productos/"+qa);
			List<Producto> producto = webResource.get(new GenericType<List<Producto>>(){});
			model.addAttribute("productos", producto);
			System.out.println(producto);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		  }
		return "productos/index";
	}
	
	@RequestMapping(value = "/producto/nuevo", method = RequestMethod.GET)
	public String nuevoProducto( Model model) {
		return "productos/nuevo";
	}
	
	@RequestMapping(value = "/producto/agregar", method = RequestMethod.POST)
	public String AgregarProducto(@ModelAttribute("productos") Producto p ) {	
		try {
			Client client = Client.create();
			WebResource webResource = client.resource("https://fast-shop-jrgflores.c9users.io/productos");
					
			String codigo_barras = p.getCodigo_barras();
			String nombre = p.getNombre();
			double Dprecio =p.getPrecio();
			double Dpeso = p.getPeso();
			String precio = String.valueOf(Dprecio);
			String peso = String.valueOf(Dpeso);
			String categoria = "1";
			//String categoria = p.getCategoria();
			String detalle = p.getDetalle();
			
			String input = "{\"codigo_barras\": \""+codigo_barras+"\", "
	                + "\"nombre\":\""+nombre+"\", \"estado\":\"1\", "
	                + "\"peso\":\""+peso+"\",\"precio\":\""+precio+"\",\"detalle\":\""+detalle+"\","
	                + "\"categoria\":\""+categoria+"\"}";
			ClientResponse response = webResource.accept("application/json").type("application/json")
					   .post(ClientResponse.class, input);
			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
					+ response.getStatus());
			}
			System.out.println("Output from Server .... \n");
			String output3 = response.getEntity(String.class);
			System.out.println(output3);
		  } catch (Exception e) {

			e.printStackTrace();

		  }
		//redirect("/productos");
		String redirectUrl = "/productos";
	    return "redirect:" + redirectUrl;
	}
	
	  @GetMapping("/producto/{codigo_barras}/editar")
		public ModelAndView form( @PathVariable String codigo_barras, ModelMap model) {
		  ModelAndView modelAndView = null;
		   ClientConfig clientConfig = new DefaultClientConfig();
			clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING,Boolean.TRUE);
			Client client = Client.create(clientConfig);
			WebResource webResource = client.resource("https://fast-shop-jrgflores.c9users.io/productos/"+codigo_barras);
			List<Producto> producto = webResource.get(new GenericType<List<Producto>>(){});
			model.addAttribute("productos", producto);
			try {
				//Producto emp = employeeService.find(employee_id);
				modelAndView = new ModelAndView("productos/editar", "productos", producto);
			} catch (Exception e) {
				model.addAttribute("message", e.getMessage());
				modelAndView = new ModelAndView("productos/editar", "productos", new Producto());
			}
			return modelAndView;
		}
	  
	  @RequestMapping(value= "/producto/{codigo_barras}/borrar", method = RequestMethod.GET)
	    public String removeProducto(@PathVariable("codigo_barras") String codigo_barras){
		  try {
				Client client = Client.create();
				WebResource webResource = client.resource("https://fast-shop-jrgflores.c9users.io/productos/"+codigo_barras);
				ClientResponse response = webResource.delete(ClientResponse.class);
				String output3 = response.getEntity(String.class);
				System.out.println(output3);
		  }catch(Exception e){
	            System.out.println(e.getStackTrace());
	        }
	        return "redirect:/productos";
	    }
	  
	  //////////////////////////////////////////////////////////////////////////
	  
	  @RequestMapping(value = "/producto/{codigo_barras}/actualizar", method = RequestMethod.POST)
		public String ActualizarProducto(@ModelAttribute("productos") Producto p,@PathVariable("codigo_barras") String codigo_barras ) {	
			try {
				Client client = Client.create();
				WebResource webResource = client.resource("https://fast-shop-jrgflores.c9users.io/productos/"+codigo_barras);
						
				String codigo_barras2 = p.getCodigo_barras();
				String nombre = p.getNombre();
				double Dprecio =p.getPrecio();
				double Dpeso = p.getPeso();
				String precio = String.valueOf(Dprecio);
				String peso = String.valueOf(Dpeso);
				//String categoria = p.getCategoria();
				String categoria = "1";
				String detalle = p.getDetalle();
				
				String input = "{\"codigo_barras\": \""+codigo_barras2+"\", "
		                + "\"nombre\":\""+nombre+"\", \"estado\":\"1\", "
		                + "\"peso\":\""+peso+"\",\"precio\":\""+precio+"\",\"detalle\":\""+detalle+"\","
		                + "\"categoria\":\""+categoria+"\"}";
				ClientResponse response = webResource.accept("application/json").type("application/json")
						   .put(ClientResponse.class, input);
				if (response.getStatus() != 200) {
					throw new RuntimeException("Failed : HTTP error code : "
						+ response.getStatus());
				}
				System.out.println("Output from Server .... \n");
				String output3 = response.getEntity(String.class);
				System.out.println(output3);
			  } catch (Exception e) {

				e.printStackTrace();

			  }
			//redirect("/productos");
			String redirectUrl = "/productos";
		    return "redirect:" + redirectUrl;
		}

}
