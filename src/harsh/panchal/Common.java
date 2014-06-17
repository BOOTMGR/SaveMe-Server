/* 
 * Copyright 2014 Harsh Panchal <panchal.harsh18@gmail.com>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package harsh.panchal;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Harsh Panchal
 */
public class Common {
    
    // pattern for common IPv4 address
    private static final String IPADDRPATTERN = 
        "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
        "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
        "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
        "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
    
    // ports used by system
    public final static int SERVER_PORT = 6500;
    public final static int ACK_PORT = 6501;
    
    /**
     * Checks whether give string is valid IPv4 address
     * 
     * @param ip string to be checked
     */
    public static boolean validateIP(String ip){  
        Pattern pattern = Pattern.compile(IPADDRPATTERN);
        Matcher matcher = pattern.matcher(ip);
        return matcher.matches();             
    }
}
