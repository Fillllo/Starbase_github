// https://nuxt.com/docs/api/configuration/nuxt-config
export default defineNuxtConfig({
  ssr: false,
  devtools: { enabled: true },
  modules: [
    'vuetify-nuxt-module',
    '@pinia/nuxt',
    
  ],
  css: [
    'assets/styles.css'
  ],
})
