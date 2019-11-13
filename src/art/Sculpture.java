package art;

import people.Artist;

public class Sculpture extends Artwork {

	private Artist artist;
	private PriceMultiplier material;
	private double weight;
	
	public Sculpture(String name, PriceMultiplier style, Artist artist,
			PriceMultiplier material, double weight) {
		super(name, style);
		this.artist = artist;
		this.material = material;
		this.weight = weight;
	}

	public Artist getArtist() {
		return artist;
	}

	public PriceMultiplier getMaterial() {
		return material;
	}

	public double getWeight() {
		return weight;
	}

	@Override
	public int compareTo(Artwork other, String key) {
		if(key == "name" || key == "style") {
			return super.compareTo(other, key);
		}
		Sculpture scu = (Sculpture) other;
		
		if(key == "artist") {
			return this.artist.getName().compareTo(scu.artist.getName());
		}
		else if(key == "material") {
			return this.material.name.compareTo(scu.artist.getName());
		}
		else {
			throw new IllegalArgumentException();
		}
	}

	@Override
	public boolean isTradable() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double calculateCost() {
		// TODO Auto-generated method stub
		return 0;
	}

}
