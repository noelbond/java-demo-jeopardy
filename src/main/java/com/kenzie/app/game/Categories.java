package com.kenzie.app.game;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kenzie.app.CustomHttpClient;
import com.kenzie.app.data.DTO.ClueDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Categories {
    private List<ClueDTO> clueDTOS;

    public static List<ClueDTO> getCategoyList(List<ClueDTO> clueList) {
        try {
            for (int i = 0; i < 10; i++) {
                Random randomClue = new Random();
                String clueURL = "https://jservice.kenzie.academy/api/clues/" + randomClue.nextInt(100);
                String clueResponse = CustomHttpClient.sendGET(clueURL);
                ObjectMapper mapper = new ObjectMapper();
                ClueDTO clueDTO;
                clueDTO = mapper.readValue(clueResponse, ClueDTO.class);
                clueList.add(i, clueDTO);
                System.out.println(clueList.get(i).getCategory().getTitle());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return clueList;
    }
}
