package pro.sky.java.course3.databasehw.service;

import org.springframework.web.multipart.MultipartFile;
import pro.sky.java.course3.databasehw.model.Avatar;

import java.io.IOException;

public interface AvatarService {
    void uploadAvatar(Long studentId, MultipartFile avatarFile) throws IOException;

    Avatar findAvatar(Long studentId);
}
