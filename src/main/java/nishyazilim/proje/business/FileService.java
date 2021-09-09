package nishyazilim.proje.business;

import java.util.List;

import nishyazilim.proje.core.utilities.result.DataResult;
import nishyazilim.proje.core.utilities.result.Result;
import nishyazilim.proje.entities.File;

public interface FileService {

	DataResult<List<File>> getAll(); //tüm dosyaları getirir
	Result add(File file);
	
	DataResult<File> getByFileName(String fileName);
}
