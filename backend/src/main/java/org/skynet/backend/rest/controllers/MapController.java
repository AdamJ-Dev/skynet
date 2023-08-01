package org.skynet.backend.rest.controllers;

import lombok.RequiredArgsConstructor;
import org.skynet.backend.rest.dtos.MapDTO;
import org.skynet.backend.services.MapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MapController {

    private MapService mapService;

    @Autowired
    public MapController(MapService mapService) {
        super();
        this.mapService = mapService;
    }

    @GetMapping("/map")
    public MapDTO getMap(@RequestParam String lat, @RequestParam String lon) {
        return this.mapService.getMap(lat, lon).block();
    }
}
