
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
  state = {esimValue : null}
 
  // async function to call the Java native method
  async sayHiFromJava() {
    HelloWorld.sayHi( (err) => {console.log(err)}, (msg) => {console.log(msg)} );
  }
  async esimDataFromJava() {
    HelloWorld.EuiccManager( (value) => {
      console.log(value);
      this.setState({esimValue:value})
    } );
  }
  
  componentWillMount =() => {
    DeviceEventEmitter.addListener('customEventName', function(e) {
      // handle event and you will get a value in event object, you can log it here
      console.log(e);
    });
  }
  render() {
    return (
      <View style={styles.container}>
        <TouchableOpacity onPress={ this.sayHiFromJava }>
              <Text>Check for esim  {this.state.esimValue}</Text>
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