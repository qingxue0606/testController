package com.example.demo;



import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestControllerApplicationTests {
    @Autowired
    private WebApplicationContext context;
    
    MockMvc mockMvc;
    @Before
    public void before() {
        mockMvc=MockMvcBuilders.webAppContextSetup(context).build();
    }

	@Test
	public void contextLoads() throws Exception {
	    String uri="/save";
	    MvcResult mvcResult=mockMvc.perform(MockMvcRequestBuilders.get(uri).accept(MediaType.APPLICATION_JSON))
	        .andReturn();
	    int status=mvcResult.getResponse().getStatus();
	    String content = mvcResult.getResponse().getContentAsString();
	    System.out.println(status);
	    System.out.println(content);
	}

}
