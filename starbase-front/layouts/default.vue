<template>
  <v-app>
    <v-app-bar class="background-black">
      <v-toolbar-title><span style="font-weight: 600; letter-spacing:6px; -webkit-text-stroke-width: 1px;
        -webkit-text-stroke-color: white; padding: 5px">STARBASE</span></v-toolbar-title>
        <v-btn icon="mdi-plus" color="white" @click="navigateTo('/ajouter')"></v-btn>
    </v-app-bar>
    <v-main class="text-white">
      <slot />
    </v-main>
    <v-bottom-navigation class="background-black">
      <NuxtLink to="/" custom>
        <v-btn max-height="56px">
          <v-icon color="white">mdi-map-search</v-icon>
        </v-btn>
      </NuxtLink>
      <NuxtLink to="/" custom>
        <v-btn max-height="56px">
          <v-icon color="white">mdi-rocket-launch</v-icon>
        </v-btn>
      </NuxtLink>
    </v-bottom-navigation>
  </v-app>
</template>

<script lang="ts" setup>

</script>

<style>
.background-black {
  background-color: black !important;
}
</style>