package com.uniq.FileUploadDownloadApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uniq.FileUploadDownloadApplication.entity.FileEntity;

public interface FileRepository extends JpaRepository<FileEntity, Long> {
}
