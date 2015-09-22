package contato;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;





import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import static java.nio.file.StandardOpenOption.*;

import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.events.StartDocument;



@WebServlet(urlPatterns = "/delete")
public class Delete extends HttpServlet {
	private static final long	serialVersionUID	= 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		StringBuilder sb = new StringBuilder();
		Path t = Paths.get("C:/Users/Gustavo Costa/Documents/Faculdade/contatos.txt");//Abre o caminho especificado
		List<String> linhas = Files.readAllLines(t,Charset.defaultCharset());
		  
		for(String linha:linhas){
			Files.write(t,linhas,Charset.defaultCharset(), StandardOpenOption.DELETE_ON_CLOSE);
				sb.append("Excluido com sucesso!!");	
							

}	
	
		}
	}


