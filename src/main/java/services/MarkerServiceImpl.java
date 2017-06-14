package services;

import models.Marker;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("markerServiceImpl")
public class MarkerServiceImpl implements MarkerService {

    @Override
    public List<Marker> getAll() {
        return null;
    }
}
