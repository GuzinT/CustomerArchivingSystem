package nishyazilim.proje.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import nishyazilim.proje.entities.File;

public interface FileDao extends JpaRepository<File,Integer>{
	File getByFileName(String fileName);
}
