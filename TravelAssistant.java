
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;
import javax.swing.SwingUtilities;

public class TravelAssistant{
    private GUI gui;

    public TravelAssistant() {
        gui = new GUI();
    }

    public static final Map<String, List<String>> continentCities = new HashMap<>();
    public static final Map<String, String> cityInfo = new HashMap<>();

    
    static {
        // Initialize continents and cities
        continentCities.put("asia", Arrays.asList("tokyo", "bangkok", "singapore", "dubai", "hong kong"));
        continentCities.put("europe", Arrays.asList("paris", "london", "rome", "barcelona", "amsterdam"));
        continentCities.put("north america", Arrays.asList("new york", "los angeles", "toronto", "mexico city", "chicago"));
        continentCities.put("south america", Arrays.asList("rio de janeiro", "buenos aires", "lima", "santiago", "bogotá"));
        continentCities.put("africa", Arrays.asList("cairo", "cape town", "nairobi", "marrakech", "johannesburg"));
        continentCities.put("australia", Arrays.asList("sydney", "melbourne"));
        continentCities.put("antarctica", Arrays.asList("mcmurdo station"));
        
        // Initialize city information for Asia
        cityInfo.put("tokyo", "Country: Japan\nPopulation: 9.7 million\nTemperature: Winter 5°C, Summer 30°C\nTop 5 Activities: Visit Tokyo Tower, Explore Shinjuku, Enjoy Sushi, Visit Sensoji Temple, Experience Akihabara");
        cityInfo.put("bangkok", "Country: Thailand\nPopulation: 10.5 million\nTemperature: Winter 26°C, Summer 35°C\nTop 5 Activities: Visit the Grand Palace, Explore Wat Arun, Shop at Chatuchak Market, Enjoy Street Food, Take a Chao Phraya River Cruise");
        cityInfo.put("singapore", "Country: Singapore\nPopulation: 5.7 million\nTemperature: Year-Round 25-31°C\nTop 5 Activities: Visit Marina Bay Sands, Explore Gardens by the Bay, Shop on Orchard Road, Visit Sentosa Island, Explore the Singapore Zoo");
        cityInfo.put("dubai", "Country: UAE\nPopulation: 3.3 million\nTemperature: Winter 20°C, Summer 41°C\nTop 5 Activities: Visit Burj Khalifa, Shop at Dubai Mall, Enjoy the Dubai Fountain, Explore the Palm Jumeirah, Desert Safari");
        cityInfo.put("hong kong", "Country: China\nPopulation: 7.5 million\nTemperature: Winter 15°C, Summer 31°C\nTop 5 Activities: Visit Victoria Peak, Shop at Temple Street Night Market, Enjoy Dim Sum, Ride the Star Ferry, Visit Disneyland");

        // Initialize city information for Europe
        cityInfo.put("paris", "Country: France\nPopulation: 2.1 million\nTemperature: Winter 5°C, Summer 25°C\nTop 5 Activities: Visit Eiffel Tower, Explore Louvre Museum, Walk Along the Seine, Visit Notre-Dame, Enjoy Cafes");
        cityInfo.put("london", "Country: United Kingdom\nPopulation: 8.9 million\nTemperature: Winter 5°C, Summer 23°C\nTop 5 Activities: Visit the British Museum, Explore the Tower of London, Walk in Hyde Park, See the Houses of Parliament, Enjoy West End Shows");
        cityInfo.put("rome", "Country: Italy\nPopulation: 2.8 million\nTemperature: Winter 8°C, Summer 30°C\nTop 5 Activities: Visit the Colosseum, Explore Vatican City, Walk through the Roman Forum, Visit the Pantheon, Enjoy Italian Cuisine");
        cityInfo.put("barcelona", "Country: Spain\nPopulation: 5.6 million\nTemperature: Winter 10°C, Summer 29°C\nTop 5 Activities: Visit Sagrada Familia, Explore Park Guell, Walk on La Rambla, Visit Camp Nou, Enjoy Tapas");
        cityInfo.put("amsterdam", "Country: Netherlands\nPopulation: 1.1 million\nTemperature: Winter 3°C, Summer 20°C\nTop 5 Activities: Visit Rijksmuseum, Explore Van Gogh Museum, Take a Canal Cruise, Visit Anne Frank House, Enjoy Biking");

        // Initialize city information for North America
        cityInfo.put("new york", "Country: USA\nPopulation: 8.4 million\nTemperature: Winter -1°C to 4°C, Spring 8°C to 17°C, Summer 20°C to 30°C, Autumn 10°C to 20°C\nTop 5 Activities: \n1. Visit the Statue of Liberty and Ellis Island: Explore these iconic American landmarks, symbols of freedom and immigration.\n2. Explore Central Park: A sprawling urban oasis offering a zoo, boat rentals, and numerous walking paths.\n3. Visit the Metropolitan Museum of Art: One of the world's largest and finest art museums, with a vast collection of art and artifacts.\n4. See a Broadway Show: Experience world-class theater in the famous Broadway district.\n5. Visit the 9/11 Memorial and Museum: Pay respects at the site of the World Trade Center, honoring the lives lost in the 2001 and 1993 terrorist attacks.");
        cityInfo.put("los angeles", "Country: USA\nPopulation: 4 million\nTemperature: Winter 13°C, Summer 24°C\nTop 5 Activities: Visit Hollywood, Explore Venice Beach, See the Griffith Observatory, Walk on Sunset Boulevard, Enjoy Universal Studios");
        cityInfo.put("toronto", "Country: Canada\nPopulation: 2.9 million\nTemperature: Winter -4°C, Summer 25°C\nTop 5 Activities: Visit CN Tower, Explore Royal Ontario Museum, See Niagara Falls, Walk in Distillery District, Visit Toronto Islands");
        cityInfo.put("mexico city", "Country: Mexico\nPopulation: 9 million\nTemperature: Winter 12°C, Summer 25°C\nTop 5 Activities: Visit Zocalo, Explore Frida Kahlo Museum, See Chapultepec Castle, Walk in Xochimilco, Visit Teotihuacan");
        cityInfo.put("chicago", "Country: USA\nPopulation: 2.7 million\nTemperature: Winter -6°C, Summer 28°C\nTop 5 Activities: Visit Willis Tower, See Millennium Park, Explore the Art Institute of Chicago, Walk on Navy Pier, Enjoy Deep-Dish Pizza");
        
        // Initialize city information for South America
        cityInfo.put("rio de janeiro", "Country: Brazil\nPopulation: 6.7 million\nTemperature: Winter 20°C, Summer 30°C\nTop 5 Activities: Visit Christ the Redeemer, Enjoy Copacabana, Explore Sugarloaf Mountain, See Maracanã Stadium, Enjoy Carnival Festival");
        cityInfo.put("buenos aires", "Country: Argentina\nPopulation: 15.2 million\nTemperature: Winter 10°C, Summer 30°C\nTop 5 Activities: Visit Casa Rosada, Explore La Boca, Walk in Recoleta Cemetery, Enjoy Tango, See Teatro Colon");
        cityInfo.put("lima", "Country: Peru\nPopulation: 10.7 million\nTemperature: Winter 17°C, Summer 26°C\nTop 5 Activities: Explore Miraflores, Visit Larco Museum, See Plaza Mayor, Walk in Barranco, Enjoy Peruvian Cuisine");
        cityInfo.put("santiago", "Country: Chile\nPopulation: 6.5 million\nTemperature: Winter 8°C, Summer 29°C\nTop 5 Activities: Visit San Cristobal Hill, Explore Palacio de La Moneda, See Plaza de Armas, Walk in Barrio Bellavista, Enjoy Chilean Wine");
        cityInfo.put("bogotá", "Country: Colombia\nPopulation: 7.4 million\nTemperature: Consistent Year-Round 14°C\nTop 5 Activities: Explore La Candelaria, Visit Gold Museum, See Monserrate, Walk in Usaquen, Enjoy Colombian Coffee");
        
        // Initialize city information for Africa
        cityInfo.put("cairo", "Country: Egypt\nPopulation: 9.5 million\nTemperature: Winter 13°C, Summer 30°C\nTop 5 Activities: Visit Pyramids of Giza, Explore Egyptian Museum, Walk in Khan El Khalili, See Cairo Tower, Enjoy Nile Cruise");
        cityInfo.put("cape town", "Country: South Africa\nPopulation: 4.6 million\nTemperature: Winter 12°C, Summer 26°C\nTop 5 Activities: Visit Table Mountain, Explore Robben Island, See Kirstenbosch Botanical Gardens, Walk at V&A Waterfront, Enjoy Cape Winelands");
        cityInfo.put("nairobi", "Country: Kenya\nPopulation: 4.4 million\nTemperature: Winter 13°C, Summer 26°C\nTop 5 Activities: Visit Nairobi National Park, Explore Karen Blixen Museum, See Giraffe Centre, Walk in Nairobi Arboretum, Enjoy Kenyan Safari");
        cityInfo.put("marrakech", "Country: Morocco\nPopulation: 1 million\nTemperature: Winter 12°C, Summer 38°C\nTop 5 Activities: Explore Jemaa el-Fnaa, Visit Majorelle Garden, See Koutoubia Mosque, Walk in the Medina, Enjoy Moroccan Cuisine");
        cityInfo.put("johannesburg", "Country: South Africa\nPopulation: 5.6 million\nTemperature: Winter 4°C, Summer 25°C\nTop 5 Activities: Visit Apartheid Museum, Explore Gold Reef City, See Constitution Hill, Walk in Soweto, Enjoy South African Barbecue");
        
        // Initialize city information for Australia
        cityInfo.put("sydney", "Country: Australia\nPopulation: 5.3 million\nTemperature: Winter 9°C, Summer 26°C\nTop 5 Activities: Visit Sydney Opera House, Explore Bondi Beach, See Sydney Harbour Bridge, Walk in Royal Botanic Garden, Enjoy Taronga Zoo");
        cityInfo.put("melbourne", "Country: Australia\nPopulation: 5 million\nTemperature: Winter 6°C, Summer 25°C\nTop 5 Activities: Explore Federation Square, Visit Melbourne Cricket Ground, See Royal Botanic Gardens, Walk in Laneways and Arcades, Enjoy Coffee Culture");
        
        // Initialize city information for Antarctica
        cityInfo.put("mcmurdo station", "Location: Antarctica\nPopulation: Approx. 1,000 (summer), 250 (winter)\nTemperature: Varies greatly, average -28°C\nTop 5 Activities: Observe Wildlife, Ice Fishing, Visit Observation Hill, Explore Ice Caves, Participate in Scientific Research");
    }

    public void run() {
        gui.updateDisplay("Waiting for city selection");
        
        Utility.clearScreen();
        
        UI.showTitle();
        Utility.printSpace();
        
        UI.showIntro();
        Utility.printSpace();
        
        
        while (true) {
            gui.updateDisplay("Waiting for city selection");
            
            // Display continents
            System.out.println("Select what continent you want to go to.");
            continentCities.keySet().forEach(continent -> System.out.println(Utility.capitalize(continent)));
            Utility.printSpace();
    
            String continentInput = Utility.getString("Choose a continent: ", "Please enter a valid string: ");
            String continent = continentInput.trim().toLowerCase(); // Trim and convert to lowercase
            Utility.pauseAndClearScreen();
    
            // Check if the continent is valid
            if (!continentCities.containsKey(continent)) {
                System.out.println("Invalid continent. Please try again.");
                Utility.pauseAndClearScreen();
                continue;
            }
    
            List<String> cities = continentCities.get(continent);
            
            // Display cities in the chosen continent
            System.out.println("Select what city you want to go to.");
            cities.forEach(city -> System.out.println(Utility.capitalize(city)));
            Utility.printSpace();
    
            String cityInput = Utility.getString("Choose a city: ", "Please enter a valid string: ");
            String city = cityInput.trim().toLowerCase(); // Trim and convert to lowercase
            Utility.pauseAndClearScreen();
    
            String info = cityInfo.getOrDefault(city, "Information not available.");
            if (!info.equals("Information not available.")){
                System.out.println("Please refer to the GUI for information about this city");
                gui.updateDisplay(cityInfo.get(city));
            }
            else{
                System.out.println(info);
            }
    
    
            System.out.println("\nDo you want to go back to the menu (M) or exit (E)?");
            String choice = Utility.getString("Choose (M)enu or (E)xit: ", "Please enter M or E: ");
            if (choice.equalsIgnoreCase("E")) {
                UI.showBye();
                break;
            }
            Utility.pauseAndClearScreen();
        }
    }
}

