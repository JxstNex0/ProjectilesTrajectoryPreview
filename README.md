<div align="center">
  <img src="https://raw.githubusercontent.com/maDU59/ProjectilesTrajectoryPreview/1.21/src/main/resources/assets/ptp/icon.png" width="150">
  <h1>Projectile Trajectory Preview</h1>

  <a href="https://modrinth.com/mod/ptp"><img src="https://img.shields.io/badge/dynamic/json?color=158000&label=downloads&prefix=+%20&query=downloads&url=https://api.modrinth.com/v2/project/preyrsIh&logo=modrinth"></a>
  <a href="https://curseforge.com/minecraft/mc-mods/ptp"><img src="https://cf.way2muchnoise.eu/full_1348218_downloads.svg"></a>
</div>

Ever wondered where your arrow, snowball, or potion will land? This mod gives you a visual preview of projectile trajectories and highlights the target impact zone—perfect for planning shots with precision.

Latest version can be downloaded on [Modrinth](https://modrinth.com/mod/ptp)

## 🔎 Features

- Trajectory Visualization: See the path your projectile will follow before you launch it.
- Target Highlighting: Know exactly where your shot is likely to land.
- Customizable Display: Tailor the look of the trajectory line, target outline, and highlight to suit your style.

## ⚙️ Configuration

To edit the settings of the mod:
- Use Mod Menu
- Use commands `/ptpConfig setting value`
- Edit the config file in `.minecraft/config/ptp.json`


## ⚠️ Limitations and notes

- Minecraft Projectiles often have a random offset, so the actual impact may sometime differs a bit from the preview.
- Modded items are not yet supported. If you want compatibility with a specific mod, open an issue on Github and suggest it, I'll do my best to add it.

## 🌐 Multiplayer and private use

This fork runs entirely on the client in singleplayer, on private servers, and on public multiplayer servers. Install the mod **only on your Minecraft client**; server installation and a server-side handshake are not required.

The preview is drawn locally: only you can see your trajectory lines and impact highlights, and no trajectory information is sent to the server or other players by this mod.

The trajectory is a prediction based on client-visible world data. Server-side physics, plugins, latency, or random projectile spread can cause deviations. Respect the rules of any server you join; some servers prohibit client-side aiming assistance.

Build with `./gradlew build` (or `gradlew.bat build` on Windows), then install the generated JAR from `build/libs/` into your client's `mods` folder along with Fabric API.

## 📦 Modpack

Feel free to add this mod in your modpacks.
