package cassiopeia.api;

import java.util.UUID;

import javax.persistence.*;

@Entity
public class Settings {
  
  @Id    
  @GeneratedValue(strategy = GenerationType.AUTO)    
  private UUID id;
  
  private  double[] volumes; 


    public Settings() {
        this.id = null;
        this.volumes = null;
    }

    public Settings(double[] volumes) {
        this.volumes = volumes;
    }

    public UUID getId() {
        return this.id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public double[] getVolumes() {
        return this.volumes;
    }

    public void setVolumes(double[] volumes) {
        this.volumes = volumes;
    }
}