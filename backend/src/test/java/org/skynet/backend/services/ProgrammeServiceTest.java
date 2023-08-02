package org.skynet.backend.services;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;
import org.skynet.backend.persistence.entities.Channel;
import org.skynet.backend.persistence.entities.Location;
import org.skynet.backend.persistence.entities.Programme;
import org.skynet.backend.persistence.repos.ProgrammeRepo;
import org.skynet.backend.rest.dtos.ProgrammeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class ProgrammeServiceTest {
    @Autowired
    private ProgrammeService ProgrammeService;

    @MockBean
    private ProgrammeRepo ProgrammeRepo;

    @MockBean
    private ModelMapper modelMapper;

    @Test
    void testGetAll() {
        List<Programme> testProgrammes = new ArrayList<>();
        Channel testChannel = new Channel(1L, "Channel1","Description","red");
        Programme testProgramme = new Programme(1L,"Programme1","Description","2/8", "3/8", testChannel, new ArrayList<>());
        testProgrammes.add(testProgramme);
        List<ProgrammeDTO> expectedDTO = new ArrayList<>();
        ProgrammeDTO testProgrammeDTO = new ProgrammeDTO(testProgramme.getId(),"Programme1","Description","2/8", "3/8", new ArrayList<>(), testChannel.getId());
        expectedDTO.add(testProgrammeDTO);

        when(this.ProgrammeRepo.findAll()).thenReturn(testProgrammes);
        when(this.modelMapper.map(testProgramme, ProgrammeDTO.class)).thenReturn(testProgrammeDTO);

        assertThat(this.ProgrammeService.getAllProgrammes().isEmpty()).isFalse();
        assertEquals(expectedDTO, this.ProgrammeService.getAllProgrammes());
        verify(this.ProgrammeRepo, times(2)).findAll();
    }



}

