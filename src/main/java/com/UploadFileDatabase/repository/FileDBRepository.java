package com.UploadFileDatabase.repository;

import com.UploadFileDatabase.model.FileDB;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileDBRepository extends JpaRepository<FileDB, String> {
}
