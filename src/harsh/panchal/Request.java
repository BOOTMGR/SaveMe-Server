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
public class Request {
    
    private String owner;
    private Ordinate ordinate;
    public int count;
    
    /**
     * Message format from client is as follow
     *      +---------+--------------+
     *      | Client  | Message from |
     *      | Address | Client       |
     *      +---------+--------------+
     * with '|' as delimiter. So the constructor extracts IP & message from
     * this message & initializes Request object.
     * 
     * NOTE: No error checking is provided here, so returned object should be
     *       checked by user.
     * 
     * @param uniMsg message obtained from client
     */
    public Request(String uniMsg) {
        this.owner = uniMsg.substring(0, uniMsg.indexOf("|"));
        this.ordinate = new Ordinate(uniMsg.substring(uniMsg.indexOf("|") + 1));
        this.count = 1;
    }
    
    @Override
    public String toString() {
        return (owner + ": " + ordinate + " count: " + count);
    }
    
    public String getOwner() {
        return owner;
    }
    
    public int getCount() {
        return count;
    }
    
    public Ordinate getOrds() {
        return ordinate;
    }
    
    public void setOrds(Ordinate ord) {
        ordinate = ord;
    }
}
