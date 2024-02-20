# Enigma Machine Simulator
A Java Enigma Machine for those who think AES is too modern.

## Overview

The Enigma machine was a mechanical encryption device used extensively by the Germans during World War II. It consisted of rotors, a reflector, and a plugboard, and it employed a complex series of substitutions to encrypt messages. This project provides a basic implementation of the Enigma encryption algorithm in Java.

## Features
  - Rotor Encryption: Simulates the rotation and substitution of letters through multiple rotors.
  - Reflector: Implements the reflector, which sends the signal back through the rotors after initial encryption.
  - Plugboard: Provides a placeholder for the plugboard, which swaps pairs of letters before and after encryption.
  - Simple Interface (Not yet implemented): Easy-to-use GUI for those who don't want to worry about the command line.

## Usage

To use this implementation of the Enigma machine, follow these steps:
- Clone the Repository: Clone this repository to your local machine.

- Compile the Code: Compile the Java files using a Java compiler or an IDE of your choice.

- Set Up the Enigma Machine: Instantiate the EnigmaMachine class and set the initial rotor positions (optional).

- Encrypt a Message: Use the EnigmaMachine.encrypt() method to encrypt a string.
