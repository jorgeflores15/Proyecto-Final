package com.flores.proyecto.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.flores.proyecto.model.Producto;
import com.flores.proyecto.model.Usuario;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
		
	
	@RequestMapping(value = "/inicio", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		
		model.addAttribute("serverTime", formattedDate );
		
		return "index";
	}
	
	@GetMapping("/usuarios")
	public String list(@ModelAttribute("SpringWeb") Producto product, ModelMap model) 
	{
		try {
			ClientConfig clientConfig = new DefaultClientConfig();
			clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING,Boolean.TRUE);
			Client client = Client.create(clientConfig);
			WebResource webResource = client.resource("https://fast-shop-jrgflores.c9users.io/usuarios");
			List<Usuario> usuario = webResource.get(new GenericType<List<Usuario>>(){});
			model.addAttribute("usuarios", usuario);
			System.out.println(usuario);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		  }
		return "usuarios/index";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String LoginAdmin(@ModelAttribute("productos") Producto p ) {	
		try {
			Client client = Client.create();
			WebResource webResource = client.resource("https://fast-shop-jrgflores.c9users.io/LoginAdmin");
			
			String LoginAdmin = p.getCodigo_barras();
			//String usuario = p.getNombre();
			//String password = p.getCategoria();
			String usuario = "admin";
			String password = "123456";
			
			String input = "{\"usuario\": \""+usuario+"\", "
	                + "\"password\":\""+password+"\","
	                + "\"categoria\":\"aa\"}";
			System.out.println(input);
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
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String login(Model model) {
		return "login/index";
	}
	
	@RequestMapping(value = "/salir", method = RequestMethod.GET)
	public String salir( Model model) {
		return "login/index";
	}
	
	/*
	@Override
	protected void configure(HttpSecurity http) throws Exception {
	    http
	      .csrf().disable();
	}*/
}
