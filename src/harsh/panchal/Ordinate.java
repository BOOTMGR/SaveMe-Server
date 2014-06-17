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

/**
 *
 * @author Harsh Panchal
 */
public class Ordinate {
    
    private float latitude;
    private float longitude;
    
    public Ordinate(float latitude, float longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }
    
    @Override
    public String toString() {
        return ("(" + latitude + "," + longitude + ")");
    }
    
    /**
     * Client sends coordinates as a string in the form 'latitude,longitude'
     * 
     * @param uniOrds string containing latitude & longitude
     */
    public Ordinate(String uniOrds) {
        this.latitude = Float.valueOf(uniOrds.substring(0, uniOrds.indexOf(",")));
        this.longitude = Float.valueOf(uniOrds.substring(uniOrds.indexOf(",") + 1));
    }
    
    public float getLatitude() {
        return latitude;
    }
    
    public float getLongitude() {
        return longitude;
    }
}
