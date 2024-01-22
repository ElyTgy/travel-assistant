import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;

public class TravelAssistant {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Map<String, List<String>> continentCities = new HashMap<>();
    private static final Map<String, String> cityInfo = new HashMap<>();

    
    static {
        // Initialize continents and cities
        continentCities.put("Asia", Arrays.asList("Tokyo", "Bangkok", "Singapore", "Dubai", "Hong Kong"));
        continentCities.put("Europe", Arrays.asList("Paris", "London", "Rome", "Barcelona", "Amsterdam"));
        continentCities.put("North America", Arrays.asList("New York", "Los Angeles", "Toronto", "Mexico City", "Chicago"));
        continentCities.put("South America", Arrays.asList("Rio de Janeiro", "Buenos Aires", "Lima", "Santiago", "Bogotá"));
        continentCities.put("Africa", Arrays.asList("Cairo", "Cape Town", "Nairobi", "Marrakech", "Johannesburg"));
        continentCities.put("Australia", Arrays.asList("Sydney", "Melbourne"));
        continentCities.put("Antarctica", Arrays.asList("McMurdo Station"));

        // Initialize city information for Asia
        cityInfo.put("Tokyo", "Country: Japan\nPopulation: 9.7 million\nTemperature: Winter 5°C, Summer 30°C\nTop 5 Activities: Visit Tokyo Tower, Explore Shinjuku, Enjoy Sushi, Visit Sensoji Temple, Experience Akihabara");
        cityInfo.put("Bangkok", "Country: Thailand\nPopulation: 10.5 million\nTemperature: Winter 26°C, Summer 35°C\nTop 5 Activities: Visit the Grand Palace, Explore Wat Arun, Shop at Chatuchak Market, Enjoy Street Food, Take a Chao Phraya River Cruise");
        cityInfo.put("Singapore", "Country: Singapore\nPopulation: 5.7 million\nTemperature: Year-Round 25-31°C\nTop 5 Activities: Visit Marina Bay Sands, Explore Gardens by the Bay, Shop on Orchard Road, Visit Sentosa Island, Explore the Singapore Zoo");
        cityInfo.put("Dubai", "Country: UAE\nPopulation: 3.3 million\nTemperature: Winter 20°C, Summer 41°C\nTop 5 Activities: Visit Burj Khalifa, Shop at Dubai Mall, Enjoy the Dubai Fountain, Explore the Palm Jumeirah, Desert Safari");
        cityInfo.put("Hong Kong", "Country: China\nPopulation: 7.5 million\nTemperature: Winter 15°C, Summer 31°C\nTop 5 Activities: Visit Victoria Peak, Shop at Temple Street Night Market, Enjoy Dim Sum, Ride the Star Ferry, Visit Disneyland");

        // Initialize city information for Europe
        cityInfo.put("Paris", "Country: France\nPopulation: 2.1 million\nTemperature: Winter 5°C, Summer 25°C\nTop 5 Activities: Visit Eiffel Tower, Explore Louvre Museum, Walk Along the Seine, Visit Notre-Dame, Enjoy Cafes");
        cityInfo.put("London", "Country: United Kingdom\nPopulation: 8.9 million\nTemperature: Winter 5°C, Summer 23°C\nTop 5 Activities: Visit the British Museum, Explore the Tower of London, Walk in Hyde Park, See the Houses of Parliament, Enjoy West End Shows");
        cityInfo.put("Rome", "Country: Italy\nPopulation: 2.8 million\nTemperature: Winter 8°C, Summer 30°C\nTop 5 Activities: Visit the Colosseum, Explore Vatican City, Walk through the Roman Forum, Visit the Pantheon, Enjoy Italian Cuisine");
        cityInfo.put("Barcelona", "Country: Spain\nPopulation: 5.6 million\nTemperature: Winter 10°C, Summer 29°C\nTop 5 Activities: Visit Sagrada Familia, Explore Park Guell, Walk on La Rambla, Visit Camp Nou, Enjoy Tapas");
        cityInfo.put("Amsterdam", "Country: Netherlands\nPopulation: 1.1 million\nTemperature: Winter 3°C, Summer 20°C\nTop 5 Activities: Visit Rijksmuseum, Explore Van Gogh Museum, Take a Canal Cruise, Visit Anne Frank House, Enjoy Biking");

        // Initialize city information for North America
        cityInfo.put("New York", "Country: USA\nPopulation: 8.4 million\nTemperature: Winter -1°C to 4°C, Spring 8°C to 17°C, Summer 20°C to 30°C, Autumn 10°C to 20°C\nTop 5 Activities: \n1. Visit the Statue of Liberty and Ellis Island: Explore these iconic American landmarks, symbols of freedom and immigration.\n2. Explore Central Park: A sprawling urban oasis offering a zoo, boat rentals, and numerous walking paths.\n3. Visit the Metropolitan Museum of Art: One of the world's largest and finest art museums, with a vast collection of art and artifacts.\n4. See a Broadway Show: Experience world-class theater in the famous Broadway district.\n5. Visit the 9/11 Memorial and Museum: Pay respects at the site of the World Trade Center, honoring the lives lost in the 2001 and 1993 terrorist attacks.");

        cityInfo.put("Los Angeles", "Country: USA\nPopulation: 4 million\nTemperature: Winter 13°C, Summer 24°C\nTop 5 Activities: Visit Hollywood, Explore Venice Beach, See the Griffith Observatory, Walk on Sunset Boulevard, Enjoy Universal Studios");
        cityInfo.put("Toronto", "Country: Canada\nPopulation: 2.9 million\nTemperature: Winter -4°C, Summer 25°C\nTop 5 Activities: Visit CN Tower, Explore Royal Ontario Museum, See Niagara Falls, Walk in Distillery District, Visit Toronto Islands");
        cityInfo.put("Mexico City", "Country: Mexico\nPopulation: 9 million\nTemperature: Winter 12°C, Summer 25°C\nTop 5 Activities: Visit Zocalo, Explore Frida Kahlo Museum, See Chapultepec Castle, Walk in Xochimilco, Visit Teotihuacan");
        cityInfo.put("Chicago", "Country: USA\nPopulation: 2.7 million\nTemperature: Winter -6°C, Summer 28°C\nTop 5 Activities: Visit Willis Tower, See Millennium Park, Explore the Art Institute of Chicago, Walk on Navy Pier, Enjoy Deep-Dish Pizza");
        
        // Initialize city information for South America
        cityInfo.put("Rio de Janeiro", "Country: Brazil\nPopulation: 6.7 million\nTemperature: Winter 20°C, Summer 30°C\nTop 5 Activities: Visit Christ the Redeemer, Enjoy Copacabana, Explore Sugarloaf Mountain, See Maracanã Stadium, Enjoy Carnival Festival");
        cityInfo.put("Buenos Aires", "Country: Argentina\nPopulation: 15.2 million\nTemperature: Winter 10°C, Summer 30°C\nTop 5 Activities: Visit Casa Rosada, Explore La Boca, Walk in Recoleta Cemetery, Enjoy Tango, See Teatro Colon");
        cityInfo.put("Lima", "Country: Peru\nPopulation: 10.7 million\nTemperature: Winter 17°C, Summer 26°C\nTop 5 Activities: Explore Miraflores, Visit Larco Museum, See Plaza Mayor, Walk in Barranco, Enjoy Peruvian Cuisine");
        cityInfo.put("Santiago", "Country: Chile\nPopulation: 6.5 million\nTemperature: Winter 8°C, Summer 29°C\nTop 5 Activities: Visit San Cristobal Hill, Explore Palacio de La Moneda, See Plaza de Armas, Walk in Barrio Bellavista, Enjoy Chilean Wine");
        cityInfo.put("Bogotá", "Country: Colombia\nPopulation: 7.4 million\nTemperature: Consistent Year-Round 14°C\nTop 5 Activities: Explore La Candelaria, Visit Gold Museum, See Monserrate, Walk in Usaquen, Enjoy Colombian Coffee");
        
        // Initialize city information for Africa
        cityInfo.put("Cairo", "Country: Egypt\nPopulation: 9.5 million\nTemperature: Winter 13°C, Summer 30°C\nTop 5 Activities: Visit Pyramids of Giza, Explore Egyptian Museum, Walk in Khan El Khalili, See Cairo Tower, Enjoy Nile Cruise");
        cityInfo.put("Cape Town", "Country: South Africa\nPopulation: 4.6 million\nTemperature: Winter 12°C, Summer 26°C\nTop 5 Activities: Visit Table Mountain, Explore Robben Island, See Kirstenbosch Botanical Gardens, Walk at V&A Waterfront, Enjoy Cape Winelands");
        cityInfo.put("Nairobi", "Country: Kenya\nPopulation: 4.4 million\nTemperature: Winter 13°C, Summer 26°C\nTop 5 Activities: Visit Nairobi National Park, Explore Karen Blixen Museum, See Giraffe Centre, Walk in Nairobi Arboretum, Enjoy Kenyan Safari");
        cityInfo.put("Marrakech", "Country: Morocco\nPopulation: 1 million\nTemperature: Winter 12°C, Summer 38°C\nTop 5 Activities: Explore Jemaa el-Fnaa, Visit Majorelle Garden, See Koutoubia Mosque, Walk in the Medina, Enjoy Moroccan Cuisine");
        cityInfo.put("Johannesburg", "Country: South Africa\nPopulation: 5.6 million\nTemperature: Winter 4°C, Summer 25°C\nTop 5 Activities: Visit Apartheid Museum, Explore Gold Reef City, See Constitution Hill, Walk in Soweto, Enjoy South African Barbecue");
        
        // Initialize city information for Australia
        cityInfo.put("Sydney", "Country: Australia\nPopulation: 5.3 million\nTemperature: Winter 9°C, Summer 26°C\nTop 5 Activities: Visit Sydney Opera House, Explore Bondi Beach, See Sydney Harbour Bridge, Walk in Royal Botanic Garden, Enjoy Taronga Zoo");
        cityInfo.put("Melbourne", "Country: Australia\nPopulation: 5 million\nTemperature: Winter 6°C, Summer 25°C\nTop 5 Activities: Explore Federation Square, Visit Melbourne Cricket Ground, See Royal Botanic Gardens, Walk in Laneways and Arcades, Enjoy Coffee Culture");
        
        // Initialize city information for Antarctica
        cityInfo.put("McMurdo Station", "Location: Antarctica\nPopulation: Approx. 1,000 (summer), 250 (winter)\nTemperature: Varies greatly, average -28°C\nTop 5 Activities: Observe Wildlife, Ice Fishing, Visit Observation Hill, Explore Ice Caves, Participate in Scientific Research");
    }

    public static void main(String[] args) {
        clearScreen();
        while (true) {
            continentCities.keySet().forEach(System.out::println);
            System.out.println("Choose a continent:");
            

            String continent = scanner.nextLine();
            pauseAndClearScreen();

            List<String> cities = continentCities.getOrDefault(continent, Arrays.asList());
            if (cities.isEmpty()) {
                System.out.println("Invalid continent. Please try again.");
                pauseAndClearScreen();
                continue;
            }

            System.out.println("Choose a city:");
            cities.forEach(System.out::println);

            String city = scanner.nextLine();
            pauseAndClearScreen();

            String info = cityInfo.getOrDefault(city, "Information not available.");
            System.out.println(info);

            System.out.println("\nDo you want to go back to the menu (M) or exit (E)?");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("E")) {
                System.out.println("Goodbye!");
                break;
            }
            pauseAndClearScreen();
        }
    }

    private static void pauseAndClearScreen() {
        try {
            Thread.sleep(1000);
            clearScreen();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    private static void clearScreen() {
        System.out.flush();
        System.out.print("\f");
    }
}