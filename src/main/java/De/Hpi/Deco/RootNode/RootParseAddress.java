package De.Hpi.Deco.RootNode;

import De.Hpi.Deco.Configure.Configuration;

import java.util.ArrayList;
import java.util.Arrays;

public class RootParseAddress {

    public String getRootPubAddress(Configuration configurationTopology){
        if(configurationTopology.WINDOWS == false )
            //linux
            return configurationTopology.rootPubAddr;
        else
            //windows
            return configurationTopology.rootPubAddrW;
    }


    public ArrayList<String> getLocalSubAddressAll(Configuration configurationTopology){
        if(configurationTopology.WINDOWS == false )
            //linux
            return new ArrayList<String>(Arrays.asList(configurationTopology.localPubAddr1, configurationTopology.localPubAddr2
                    , configurationTopology.localPubAddr3, configurationTopology.localPubAddr4));
        else
            //windows
            return new ArrayList<String>(Arrays.asList(configurationTopology.localPubAddr1W, configurationTopology.localPubAddr2W
                    , configurationTopology.localPubAddr3W, configurationTopology.localPubAddr4W));
    }

}