package de.argantiu.perplayerworld;

//import de.argantiu.perplayerworld.cmd
//import de.argantiu.perplayerworld.gui

public class PerPlayerWorld extends JavaPlugin {
    private static boolean is1_13Plus = false;
    final private String version = this.getDescription().getVersion();
    private CreatorAdapter creator;
  
  public static void createConfigs() {
    File folder = getInstance().getDataFolder();
    File dir = new File(folder + "/worlds");
    
