package kg.megacom.auction.service;

import kg.megacom.auction.models.dto.StatusDto;
import org.springframework.web.bind.annotation.RequestBody;

public interface StatusService {
    StatusDto save( StatusDto statusDto);
}
