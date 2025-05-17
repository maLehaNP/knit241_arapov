package org.knit.solutions.lab7.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
/*import org.knit.solutions.lab7.clipboard.SystemClipboardService;
import org.knit.solutions.lab7.crypto.AesEncryptionService;
import org.knit.solutions.lab7.repository.InMemoryPasswordRepository;
import org.knit.solutions.lab7.security.MasterPasswordHolder;
import org.knit.solutions.lab7.service.PasswordService;
import org.springframework.context.annotation.Bean;*/

@Configuration
@ComponentScan("org.knit.solutions.lab7")
public class AppConfig {
    /*@Bean
    public InMemoryPasswordRepository inMemoryPasswordRepository() {
        return new InMemoryPasswordRepository();
    }

    @Bean
    public SystemClipboardService systemClipboardService() {
        return new SystemClipboardService();
    }

    @Bean
    public MasterPasswordHolder masterPasswordHolder() {
        return new MasterPasswordHolder();
    }

    @Bean
    public AesEncryptionService aesEncryptionService() {
        return new AesEncryptionService(masterPasswordHolder());
    }

    @Bean
    public PasswordService passwordService() {
        return new PasswordService(inMemoryPasswordRepository(), systemClipboardService(), aesEncryptionService());
    }*/
}
