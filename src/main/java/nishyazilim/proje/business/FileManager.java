package nishyazilim.proje.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nishyazilim.proje.core.utilities.result.DataResult;
import nishyazilim.proje.core.utilities.result.Result;
import nishyazilim.proje.core.utilities.result.SuccessDataResult;
import nishyazilim.proje.core.utilities.result.SuccessResult;
import nishyazilim.proje.dataAccess.FileDao;
import nishyazilim.proje.entities.File;

@Service
public class FileManager implements FileService{
	
	private FileDao fileDao; 
	
	@Autowired
	public FileManager(FileDao fileDao) {
		super();
		this.fileDao = fileDao;
	}

	@Override
	public DataResult<List<File>> getAll() {
		return new SuccessDataResult<List<File>>(this.fileDao.findAll(),"Dosyalar listelendi.");
	}

	@Override
	public Result add(File file) {
		this.fileDao.saveAndFlush(file);
		return new SuccessResult("Dosya eklendi.");
	}

	@Override
	public DataResult<File> getByFileName(String fileName) {
		return new SuccessDataResult<File>(this.fileDao.getByFileName(fileName),"Dosya listelendi.");
	}

}
