package ar.com.ada.mongo.noaa.services;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.ada.mongo.noaa.entities.Boya;
import ar.com.ada.mongo.noaa.repos.BoyaRepository;



@Service
public class BoyaService {

    @Autowired
    BoyaRepository repo;

    public Boya crearBoya(Double latitud, Double longitud) {

        Boya boya = new Boya();
        boya.setLatitudInstalacion(latitud);
        boya.setLongitudInstalacion(longitud);
        boya.setColorLuz("azul");

        return repo.save(boya);
    }

    public List<Boya> obtenerBoyas() {
        return repo.findAll();
    }

    /*public Boya buscarPorId(Integer id) {

        return repo.findById(id);
    }*/

    public void guardar(Boya boya) {
        repo.save(boya);
    }

    public List<Boya> buscarPorColor(String color) {
        List<Boya> boyasColor = new ArrayList<>();

        for (Boya boya : repo.findAll()) {
            if (boya.getColorLuz().equals(color)) {
                boyasColor.add(boya);
            }

        }
        return boyasColor;
    }

}
