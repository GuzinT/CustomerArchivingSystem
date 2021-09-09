package nishyazilim.proje.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import nishyazilim.proje.business.FileService;
import nishyazilim.proje.core.utilities.result.DataResult;
import nishyazilim.proje.core.utilities.result.Result;
import nishyazilim.proje.entities.File;

@RestController
@RequestMapping("/api/files")
public class FilesController {

	private FileService fileService;
	
	@Autowired
	public FilesController(FileService fileService) {
		super();
		this.fileService = fileService;
	}

	@GetMapping("/getall")
	public DataResult<List<File>> getAll(){
		return this.fileService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody File file) {
		return this.fileService.add(file);
	}
	
	@GetMapping("/getByFileName")
	public DataResult<File> getByFileName(@RequestParam String fileName){
		return this.fileService.getByFileName(fileName);
	}
	
	
}
