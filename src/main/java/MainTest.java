
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.nextapps.model.Cidade;
import br.com.nextapps.model.Endereco;
import br.com.nextapps.model.Estado;
import br.com.nextapps.model.HistoricoEclesiastico;
import br.com.nextapps.model.IgrejaBatismo;
import br.com.nextapps.model.Menbro;

public class MainTest {

	public static void main(String[] args) throws JsonProcessingException {
		
		
		Menbro menbro1 = new Menbro();
		menbro1.setEndereco(
				new Endereco().setCidadeEndereco(
						new Cidade().setEstadoCidade(
								new Estado()
								.setNome("São Paulo")
								.setSigla("SP"))
						.setNomeCidade("Ribeirão Preto")));
		menbro1.setHistoricoEclesiastico(new HistoricoEclesiastico());
		
		menbro1.setIgrejaBatismo(new IgrejaBatismo());
		menbro1.setHistoricoEclesiastico(new HistoricoEclesiastico());
		
		ObjectMapper mapper = new ObjectMapper();
		
		String result = mapper.writeValueAsString(menbro1);
		
		
		System.out.println(result);
	}
}
