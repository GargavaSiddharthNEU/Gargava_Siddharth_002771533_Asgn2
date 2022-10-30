/*
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author siddh
 */
public class CommunityDirectory {
    
    private ArrayList<Community> communities;

    public CommunityDirectory() {
        this.communities = new ArrayList<Community>();
    }
    
    public void addCommunity(Community community){
        
        communities.add(community);
       
    }
    
    public ArrayList<Community> getCommunities() {
        return communities;
    }

    public void setCommunities(ArrayList<Community> communities) {
        this.communities = communities;
    }
    
    public void deleteCommunity(Community com) {
        this.communities.remove(com);
    }

    public void updateCommunity(Community com, int index) {
        this.communities.set(index, com);
    }

}
