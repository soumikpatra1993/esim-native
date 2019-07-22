
import React, { Component } from 'react';
import { DeviceEventEmitter } from 'react-native';

import {
  Platform,
  StyleSheet,
  Text,
  TouchableOpacity,
  View , 
} from 'react-native';
 
// We are importing the native Java module here
import {NativeModules} from 'react-native';
var HelloWorld = NativeModules.HelloWorld;
 
type Props = {};
export default class App extends Component<Props> {

  // async function to call the Java native method
   sayHiFromJava() {
   DeviceEventEmitter.addListener('check',
    (e)=>{
      console.log("hello");
  
  })
  }
  
  componentDidMount =() => {
 
  }
  render() {
    return (
      <View style={styles.container}>
        <TouchableOpacity onPress={ this.sayHiFromJava }>
              <Text>Check for esim </Text>
         </TouchableOpacity>
      </View>
    );
  }
}
 
const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: '#F5FCFF',
  }
})