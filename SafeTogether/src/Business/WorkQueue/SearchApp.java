/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author raksh
 */
public class SearchApp {
   
    Map<String, List<String>> searchByName = new HashMap<>(); 

    public Map<String, List<String>> getSearchByName() {
        return searchByName;
    }

    public void setSearchByName(Map<String, List<String>> searchByName) {
        this.searchByName = searchByName;
    }

   
    
}
