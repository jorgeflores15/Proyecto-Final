package com.flores.proyecto.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.flores.proyecto.model.Producto;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;

@Controller
public class HistorialController {


	@RequestMapping(value = "/historial", method = RequestMethod.POST,params="s")
	public  String buscar(@ModelAttribute("SpringWeb") Producto product,@RequestParam("s") String s,  ModelMap model) {
		try {
			ClientConfig clientConfig = new DefaultClientConfig();
			clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING,Boolean.TRUE);
			Client client = Client.create(clientConfig);
			WebResource webResource = client.resource("https://fast-shop-jrgflores.c9users.io/facturas/"+s);
			List<Producto> producto = webResource.get(new GenericType<List<Producto>>(){});
			model.addAttribute("productos", producto);
			System.out.println(producto);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		  }
		return "ss";
	}
	
	@RequestMapping(value = "/historial", method = RequestMethod.GET,params="s")
	public  String buscar2(@ModelAttribute("SpringWeb") Producto product,@RequestParam("s") String s,  ModelMap model) {
		try {
			ClientConfig clientConfig = new DefaultClientConfig();
			clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING,Boolean.TRUE);
			Client client = Client.create(clientConfig);
			WebResource webResource = client.resource("https://fast-shop-jrgflores.c9users.io/facturas/"+s);
			List<Producto> producto = webResource.get(new GenericType<List<Producto>>(){});
			model.addAttribute("productos", producto);
			System.out.println(producto);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		  }
		return "historial/index";
	}
	 @GetMapping("/historial/{codigo_barras}/editar")
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
}
