const { defineConfig } = require('@vue/cli-service')
console.log('Loading vue.config.js...');
module.exports = defineConfig({
  transpileDependencies: false,
  devServer: {
    disableHostCheck: true,
  }
})
