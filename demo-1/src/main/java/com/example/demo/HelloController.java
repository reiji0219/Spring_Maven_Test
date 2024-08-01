package com.example.demo;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController 
{
	@Autowired							//この2行は「postgreSQL」と連携する為に記述
	JdbcTemplate jdbcTemplate; 	//DBのデータを読み込む為に27～29行目を記述
	
	@GetMapping("/")					//「Hello」と言う名の「HTMLファイル」を探す為の記述
	public String index(){				//「http://localhost:8080/」とアドレスバーに記述すると
		return "Hello" ;					//HTMLファイルの「Hello WebWorld」が表示される
	}											
	
	@PostMapping("name")
	public String name(@RequestParam( "name" ) String name, Model model ) {
			List<Map<String,Object>> list;									//
			list = jdbcTemplate.queryForList( "select * from users" );//この3行を記述する
			model.addAttribute( "users", list );								//
			model.addAttribute( "name", name );
		return "name";
	}
	
}