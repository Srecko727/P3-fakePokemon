import java.util.ArrayList;

public class Pakudex
{
    //private ArrayList<Pakuri>pakudex;
    private Pakuri[] locationPakuri;
    public int indexPakuri = 0;

    public Pakudex() //the house of the project
    {
        locationPakuri = new Pakuri[20];
    }
    public Pakudex(int capacity) // the address of the project
    {
        locationPakuri = new Pakuri[capacity];
    }
    public int getSize()
    {
        int location = 0;
        /*for (int i=0;i < locationPakuri.length;i++)
        {
            if (locationPakuri[i] != null)
                location = location + 1;
                location = indexPakuri;
        }*/
        location = indexPakuri;
        return location;
    }
    public int getCapacity()
    {
        return locationPakuri.length;
    }
    public String[] getSpeciesArray()
    {
        String[] namePakuri = new String[locationPakuri.length];
        for(int i = 0; i < indexPakuri;i++)
        {
            if (locationPakuri != null)
            {
                locationPakuri[i].getSpecies();
                namePakuri[i] = locationPakuri[i].getSpecies();
            }
            else if (locationPakuri == null)
            {
                break;
            }
        }
        return namePakuri;
    }
    public int[] getStats(String species)   //most confusing  still not working correctly
    {
        int[] statsPakuri = new int[3];
        boolean isThere = true;
        int location = 0;
        for (int i=0; i < indexPakuri; i++)
        {
            if (!locationPakuri[i].getSpecies().equals(species))
            {
                isThere = false;
                //location = 1;
                //break;
            }
            else
            {
                isThere = true;
                location = i ;      //changing this from a 1 to an i is a big difference
                //break;
            }
            //break;
        }
        if (isThere)
        {
            statsPakuri[0] = locationPakuri[location].getAttack();
            statsPakuri[1] = locationPakuri[location].getDefense();
            statsPakuri[2] = locationPakuri[location].getSpeed();
            return statsPakuri;
        }
        else
        {
            return null;
        }
    }
    public void sortPakuri()
    {
        Pakuri[] type = new Pakuri[getCapacity()];
        for (int i=0; i< indexPakuri; i++)
        {
            for (int o = 1; o < indexPakuri;o++)
            {
                if (locationPakuri[i].getSpecies().compareTo(locationPakuri[o].getSpecies()) > 0)
                {
                    type[i] = locationPakuri[i];
                    locationPakuri[i] = locationPakuri[o];
                    locationPakuri[o] = type[i];
                }
            }
        }
        System.out.println("Pakuri have been sorted!");
    }
    public boolean addPakuri(String species)
    {
        boolean isThere = false;
        if (indexPakuri >= locationPakuri.length)
        {
            System.out.println("");
            System.out.println("Error Pakudex is full!");
            return isThere;
        }
        else if (indexPakuri > 0 )
        {
            for (int i = 0; i < indexPakuri; i++)
            {
                if (locationPakuri[i].getSpecies().equals(species))
                {
                    isThere = true;
                    break;
                }
                else
                {
                    continue;
                }
            }
        }
        if (isThere)
        {
            System.out.println("");
            System.out.println("Error: Pakudex already contains this species!");
            return false;
        }
        else
        {
            Pakuri animal = new Pakuri(species);
            locationPakuri[indexPakuri] = animal;
            indexPakuri++;
            return true;
        }
    }
    public boolean evolveSpecies(String species)
    {
        boolean isThere = true;
        //int location = 0;
        for (int i = 0; i < indexPakuri; i++)
        {
            if ((locationPakuri[i].getSpecies().equals(species)) && (isThere))
            {
                isThere = true;
                locationPakuri[i].evolve();
                //location = 1;
                break;
                //return true;
            }
            else
                {
                isThere = true;
                System.out.println("");
                System.out.println("Error: No such Pakuri!");
                return false;
                }
        }
        /*if (isThere)
        {
            locationPakuri[].evolve();
            return true;
        }
        else
        {
            System.out.println("");
            System.out.println("Error: No such Pakuri!");
            return false;
        }*/
        return true;
    }
}
