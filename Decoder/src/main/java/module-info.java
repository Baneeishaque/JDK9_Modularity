/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

module jdk9_modularity.Decoder {
    requires jdk9_modularity.Reader;
    uses jdk9_modularity.Reader.Scanner;
    exports jdk9_modularity.Decoder;
}
