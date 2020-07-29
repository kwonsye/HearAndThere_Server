package team_mic.here_and_there.backend.audio_guide.dto.response;

import java.util.List;
import lombok.Builder;
import lombok.Getter;

@Getter
public class ResAudioTrackInfoListDto {

  private Long audioGuideId;

  private String audioGuideTitle;

  private List<ResAudioTrackInfoItemDto> audioTrackInfoList;

  @Builder
  private ResAudioTrackInfoListDto(Long audioGuideId,
      String audioGuideTitle,
      List<ResAudioTrackInfoItemDto> audioTrackInfoList) {
    this.audioGuideId = audioGuideId;
    this.audioGuideTitle = audioGuideTitle;
    this.audioTrackInfoList = audioTrackInfoList;
  }
}
