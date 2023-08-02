package org.skynet.backend.services;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;
import org.skynet.backend.persistence.entities.Channel;
import org.skynet.backend.persistence.repos.ChannelRepo;
import org.skynet.backend.rest.dtos.ChannelDTO;
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
public class ChannelServiceTest {
    @Autowired
    private ChannelService channelService;

    @MockBean
    private ChannelRepo channelRepo;

    @MockBean
    private ModelMapper modelMapper;

    @Test
    void testGetAll() {
        List<Channel> testChannels = new ArrayList<>();
        Channel testChannel = new Channel(1L,"Channel1","Description","red");
        testChannels.add(testChannel);
        List<ChannelDTO> expectedDTO = new ArrayList<>();
        ChannelDTO testChannelDTO = new ChannelDTO(testChannel.getId(),"Channel1","Description","red");
        expectedDTO.add(testChannelDTO);

        when(this.channelRepo.findAll()).thenReturn(testChannels);
        when(this.modelMapper.map(testChannel, ChannelDTO.class)).thenReturn(testChannelDTO);

        assertThat(this.channelService.getAllChannels().isEmpty()).isFalse();
        assertEquals(expectedDTO, this.channelService.getAllChannels());
        verify(this.channelRepo, times(2)).findAll();
    }



}
