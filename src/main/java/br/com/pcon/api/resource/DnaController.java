package br.com.pcon.api.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pcon.api.model.Dna;
import br.com.pcon.api.repository.DnaRepository;

@RestController
@RequestMapping("/dna")
public class DnaController {

	@Autowired
	private DnaRepository dnaRepository;
	
	@GetMapping
	public List<Dna> listAll() {
		return dnaRepository.findAll();
	}

}
