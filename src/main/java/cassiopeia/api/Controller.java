package cassiopeia.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@CrossOrigin(origins = "*")

@RestController
public class Controller {
    
    @Autowired
    Repo repository;

    @GetMapping("/settings")
    public List<Settings> getSettings() {
        return repository.findAll();
    }

    @PostMapping("/create")
    public UUID createSettings(@RequestBody Settings volumes) {
        repository.save(volumes);
        return volumes.getId();
    }

    @GetMapping("/settings/{id}")
    public double[] getOrderById(@PathVariable UUID id) {
        Settings temp = repository.findById(id).orElse(null);
        return temp.getVolumes();
    }







}
