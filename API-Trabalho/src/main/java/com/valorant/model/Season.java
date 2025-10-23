package com.valorant.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Season {
    public String uuid;
    public String displayName;
    public String start;
    public String end;

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class SeasonResponse {
        public List<Season> data;
    }
}
