package kg.megacom.auction.service.impl;

import kg.megacom.auction.mappers.ClassMappers;
import kg.megacom.auction.models.dto.StatusDto;
import kg.megacom.auction.models.entity.Statuses;
import kg.megacom.auction.repositories.StatusRep;
import kg.megacom.auction.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatusServiceImpl implements StatusService {
    @Autowired
    private StatusRep statusRep;
    @Override
    public StatusDto save(StatusDto statusDto) {
        Statuses statuses= ClassMappers.INSTANCE.statusDtoToStatus(statusDto);
        statusRep.save(statuses);
        statusDto=ClassMappers.INSTANCE.statusToStatuses(statuses);
        return statusDto;
    }
}
