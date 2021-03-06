package team_mic.here_and_there.backend.audio_guide.dto.response;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@JsonPropertyOrder({"category", "audioGuideList"})
public class ResAudioGuideListDto {

  private String category;

  private List<ResAudioGuideItemDto> audioGuideList;

  @Builder
  private ResAudioGuideListDto(String category, List<ResAudioGuideItemDto> audioGuideList) {
    this.category = category;
    this.audioGuideList = audioGuideList;
  }
}
