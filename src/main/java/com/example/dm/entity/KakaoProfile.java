package com.example.dm.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class KakaoProfile {
    private Long id;
    private String connected_at;
    private KakaoAccount kakao_account;
    private Properties properties;

    @JsonIgnoreProperties(ignoreUnknown = true)
    @Data
    public static class KakaoAccount {
        private Boolean email_needs_agreement;
        private Boolean is_email_valid;
        private Boolean is_email_verified;
        private String email;
        private Boolean profile_nickname_needs_agreement;
        private Boolean profile_image_needs_agreement;
        private Profile profile;
        private Boolean name_needs_agreement;
        private String name;
        private Boolean age_range_needs_agreement;
        private String age_range;
        private Boolean birthyear_needs_agreement;
        private String birthyear;
        private Boolean birthday_needs_agreement;
        private String birthday;
        private String birthday_type;
        private Boolean gender_needs_agreement;
        private String gender;
        private Boolean phone_number_needs_agreement;
        private String phone_number;
        private Boolean ci_needs_agreement;
        private String ci;
        private String ci_authenticated_at;

        @JsonIgnoreProperties(ignoreUnknown = true)
        @Data
        public static class Profile {
            private String nickname;
            private String thumbnail_image_url;
            private String profile_image_url;
            private Boolean is_default_image;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    @Data
    public static class Properties {
        private String CUSTOM_PROPERTY_KEY;
    }
}
