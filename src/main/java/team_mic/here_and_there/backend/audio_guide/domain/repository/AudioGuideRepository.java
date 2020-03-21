package team_mic.here_and_there.backend.audio_guide.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import team_mic.here_and_there.backend.audio_guide.domain.entity.AudioGuide;

import java.util.Optional;

@Repository
public interface AudioGuideRepository extends JpaRepository<AudioGuide, Long> {
}