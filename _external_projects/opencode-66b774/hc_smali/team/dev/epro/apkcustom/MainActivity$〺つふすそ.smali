.class public Lteam/dev/epro/apkcustom/MainActivity$〺つふすそ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/おぐぴう〸ず/〺つふすそ;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lteam/dev/epro/apkcustom/MainActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:[Ljava/lang/String;

.field public final synthetic くし〴〺ぅ:[[Ljava/lang/String;

.field public final synthetic げつ〴ぬぐ:I

.field public final synthetic づざかべべ:Lteam/dev/epro/apkcustom/MainActivity;

.field public final synthetic びぐびあび:Landroid/view/MenuItem;


# direct methods
.method public constructor <init>(Lteam/dev/epro/apkcustom/MainActivity;I[Ljava/lang/String;[[Ljava/lang/String;Landroid/view/MenuItem;)V
    .registers 6

    iput-object p1, p0, Lteam/dev/epro/apkcustom/MainActivity$〺つふすそ;->づざかべべ:Lteam/dev/epro/apkcustom/MainActivity;

    iput p2, p0, Lteam/dev/epro/apkcustom/MainActivity$〺つふすそ;->げつ〴ぬぐ:I

    iput-object p3, p0, Lteam/dev/epro/apkcustom/MainActivity$〺つふすそ;->〺つふすそ:[Ljava/lang/String;

    iput-object p4, p0, Lteam/dev/epro/apkcustom/MainActivity$〺つふすそ;->くし〴〺ぅ:[[Ljava/lang/String;

    iput-object p5, p0, Lteam/dev/epro/apkcustom/MainActivity$〺つふすそ;->びぐびあび:Landroid/view/MenuItem;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public 〺つふすそ()V
    .registers 4

    iget v0, p0, Lteam/dev/epro/apkcustom/MainActivity$〺つふすそ;->げつ〴ぬぐ:I

    const v1, 0x7f09025e

    if-ne v0, v1, :cond_2b

    .line 1
    sget-object v0, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v1, "@ef@1:\u001c6gK0jAcmAbg\u001c0>Ifo\u001adhO1l\u0019anOj=\u0019fo\u001eeiN1mL7;\u001b1=\u001a4o\u001c3g@foH`9H"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    .line 2
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_2b

    iget-object v0, p0, Lteam/dev/epro/apkcustom/MainActivity$〺つふすそ;->づざかべべ:Lteam/dev/epro/apkcustom/MainActivity;

    invoke-static {v0, v2}, Lteam/dev/epro/apkcustom/MainActivity;->ぷぞてのほき(Lteam/dev/epro/apkcustom/MainActivity;Z)V

    :catch_1f
    :goto_1f
    iget-object v0, p0, Lteam/dev/epro/apkcustom/MainActivity$〺つふすそ;->づざかべべ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 3
    iget-boolean v0, v0, Lteam/dev/epro/apkcustom/MainActivity;->きぬどぼみ〸:Z

    if-nez v0, :cond_2b

    const-wide/16 v0, 0x3e8

    .line 4
    :try_start_27
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_2a
    .catch Ljava/lang/InterruptedException; {:try_start_27 .. :try_end_2a} :catch_1f

    goto :goto_1f

    :cond_2b
    return-void
.end method

.method public げつ〴ぬぐ()V
    .registers 33

    move-object/from16 v0, p0

    iget-object v1, v0, Lteam/dev/epro/apkcustom/MainActivity$〺つふすそ;->づざかべべ:Lteam/dev/epro/apkcustom/MainActivity;

    const/4 v2, 0x0

    .line 1
    iput-boolean v2, v1, Lteam/dev/epro/apkcustom/MainActivity;->きぬどぼみ〸:Z

    .line 2
    iget v2, v0, Lteam/dev/epro/apkcustom/MainActivity$〺つふすそ;->げつ〴ぬぐ:I

    const-string v3, "\u00190:Acn\u001d0j\u001bcmA`k\u001a6mJbgJ3fKcfAkmJ0"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "Ne=\u001bc:N1oNa;\u001c0h\u001ee<JfmIc:Le>\u001bgm\u001aaj\u001cbf\u00196<J6=Mg9\u001dk>\u001ekk\u001a3l\u001demNjoNbnJ79\u001djhO3n\u00193:Jfi\u00197jHdlL`<L7:Jbi\u001bbl"

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, " --dport 53 -j DNAT --to-destination 8.8.4.4\niptables -t nat -A PREROUTING -i "

    const-string v7, " priority 17701\niptables -t nat -A PREROUTING -i "

    const-string v8, " priority 17700\nip rule add to 8.8.4.4 iif "

    const-string v9, " -j MASQUERADE\nip rule add to 8.8.8.8 iif "

    const-string v10, " priority 17800\niptables -t nat -A vpnhotspot_masquerade -s "

    const-string v11, " -j MASQUERADE\nip rule add  iif "

    const-string v12, " priority 17900\niptables -t nat -A vpnhotspot_masquerade -s "

    const-string v13, " unreachable priority 17980\nip rule add  iif "

    const-string v14, " -j ACCEPT\niptables -t nat -N vpnhotspot_masquerade\niptables -t nat -I POSTROUTING -j vpnhotspot_masquerade\nip rule add  iif "

    const-string v15, "\u001bdfAjmH7o\u001ac;Mef\u0019a;L0nOdn\u001d7=JejHa"

    invoke-static {v15}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    move-object/from16 v16, v3

    const-string v3, " -m state --state ESTABLISHED,RELATED -j ACCEPT\niptables -t filter -A vpnhotspot_fwd -i "

    move-object/from16 v17, v4

    const-string v4, " -j ACCEPT\niptables -t filter -I vpnhotspot_fwd -o "

    move-object/from16 v18, v5

    const-string v5, "Ien\u001bc=AckN1l\u001d0=M6;@d9AbgLgk\u001cfjJd"

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    move-object/from16 v19, v6

    const-string v6, " --dport 53 -j DNAT --to-destination 8.8.8.8\niptables -t nat -A PREROUTING -i "

    move-object/from16 v20, v5

    const-string v5, "LbfHg9Iaj\u0019aj\u001bgnL1;I`fKalAag\u001b`:\u001c`"

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    move-object/from16 v21, v6

    const-string v6, "\u0019fj\u001ek>\u001a`oNfl@7iOjoLd;Lg;A1=Nfi@3"

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v22, v5

    const-string v5, "HaiAehO0gJ1i\u00190;M7>\u001eg;\u0019`9\u001b`lH1k\u001eb"

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    move-object/from16 v23, v7

    const-string v7, "Hdi\u001c1i\u001cefL3fMkgJc;Kdl\u001a7mMd=Ak=K4"

    invoke-static {v7}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    move-object/from16 v24, v8

    const v8, 0x7f09025f

    if-ne v2, v8, :cond_525

    .line 3
    sget-object v2, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 4
    check-cast v2, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v2, v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->〻しざ〹おま(Landroid/content/Context;)Z

    move-result v1

    const-string v2, "iptables -N vpnhotspot_fwd\niptables -t filter -I FORWARD -j vpnhotspot_fwd\niptables -t filter -I vpnhotspot_fwd -i "

    if-nez v1, :cond_1b8

    .line 5
    sget-object v1, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 6
    check-cast v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->へえどぜせ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1b8

    iget-object v1, v0, Lteam/dev/epro/apkcustom/MainActivity$〺つふすそ;->〺つふすそ:[Ljava/lang/String;

    invoke-static {v2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    .line 7
    sget-object v25, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    move-object/from16 v26, v2

    .line 8
    move-object/from16 v2, v25

    check-cast v2, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-static {v2, v8, v4}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ざっざへづ(Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 9
    sget-object v2, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 10
    check-cast v2, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-static {v2, v8, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ざっざへづ(Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 11
    sget-object v2, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 12
    check-cast v2, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-static {v2, v8, v15}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ざっざへづ(Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 13
    sget-object v2, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 14
    check-cast v2, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-static {v2, v8, v14}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ざっざへづ(Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 15
    sget-object v2, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 16
    check-cast v2, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-static {v2, v8, v13}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ざっざへづ(Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 17
    sget-object v2, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 18
    check-cast v2, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-static {v2, v8, v7}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ざっざへづ(Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    iget-object v2, v0, Lteam/dev/epro/apkcustom/MainActivity$〺つふすそ;->づざかべべ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 19
    iget-object v2, v2, Lteam/dev/epro/apkcustom/MainActivity;->ながふずは:Ljava/lang/String;

    .line 20
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    sget-object v2, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 22
    check-cast v2, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->へえどぜせ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v0, Lteam/dev/epro/apkcustom/MainActivity$〺つふすそ;->づざかべべ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 23
    iget-object v2, v2, Lteam/dev/epro/apkcustom/MainActivity;->ながふずは:Ljava/lang/String;

    .line 24
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    sget-object v2, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 26
    check-cast v2, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-static {v2, v8, v7}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ざっざへづ(Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 27
    sget-object v2, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 28
    check-cast v2, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-static {v2, v8, v10}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->でどあくず(Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 29
    sget-object v2, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 30
    check-cast v2, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->へえどぜせ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    sget-object v2, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 32
    check-cast v2, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-static {v2, v8, v9}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->でどあくず(Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 33
    sget-object v2, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 34
    check-cast v2, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-static {v2, v8, v7}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ざっざへづ(Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 35
    sget-object v2, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 36
    check-cast v2, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    move-object/from16 v25, v9

    move-object/from16 v9, v24

    invoke-static {v2, v8, v9}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->でどあくず(Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 37
    sget-object v2, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 38
    check-cast v2, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-static {v2, v8, v7}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ざっざへづ(Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 39
    sget-object v2, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 40
    check-cast v2, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    move-object/from16 v9, v23

    invoke-static {v2, v8, v9}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->でどあくず(Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 41
    sget-object v2, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 42
    check-cast v2, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    move-object/from16 v9, v22

    invoke-static {v2, v8, v9}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ざっざへづ(Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 43
    sget-object v2, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 44
    check-cast v2, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->へえどぜせ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v2, v21

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    sget-object v21, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    move-object/from16 v22, v10

    .line 46
    move-object/from16 v10, v21

    check-cast v10, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    move-object/from16 v21, v11

    move-object/from16 v11, v20

    invoke-static {v10, v8, v11}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ざっざへづ(Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 47
    sget-object v10, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 48
    check-cast v10, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v10}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->へえどぜせ()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    sget-object v10, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 50
    check-cast v10, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-static {v10, v8, v9}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ざっざへづ(Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 51
    sget-object v10, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 52
    check-cast v10, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v10}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->へえどぜせ()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v10, v19

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    sget-object v19, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    move-object/from16 v20, v10

    .line 54
    move-object/from16 v10, v19

    check-cast v10, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-static {v10, v8, v11}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ざっざへづ(Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 55
    sget-object v10, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 56
    check-cast v10, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v10}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->へえどぜせ()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v10, v18

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    const/16 v18, 0x0

    aput-object v8, v1, v18

    goto :goto_1ca

    :cond_1b8
    move-object/from16 v26, v2

    move-object/from16 v25, v9

    move-object/from16 v2, v21

    move-object/from16 v9, v22

    move-object/from16 v22, v10

    move-object/from16 v21, v11

    move-object/from16 v10, v18

    move-object/from16 v11, v20

    move-object/from16 v20, v19

    .line 57
    :goto_1ca
    sget-object v1, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 58
    check-cast v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->ぅばづそほせ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const-string v8, "M6i@cg\u0019g<A`k\u0019go\u001abmLe9\u001e6;Men\u001edfO3"

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    move-object/from16 v18, v8

    const-string v8, "Aj9@b9Agl\u00191gM`<K7j\u001bd;\u001aaj@a=Lbn\u001d1o\u001ejmMji\u00191;\u001e7oH6oAfh\u001akj@7iJ1mAgl\u001a"

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    if-nez v1, :cond_38e

    iget-object v1, v0, Lteam/dev/epro/apkcustom/MainActivity$〺つふすそ;->〺つふすそ:[Ljava/lang/String;

    move-object/from16 v19, v8

    invoke-static/range {v26 .. v26}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    .line 59
    sget-object v27, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    move-object/from16 v28, v5

    .line 60
    move-object/from16 v5, v27

    check-cast v5, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-static {v5, v8, v4}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぶでにく〼〳(Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 61
    sget-object v5, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 62
    check-cast v5, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-static {v5, v8, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぶでにく〼〳(Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 63
    sget-object v5, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 64
    check-cast v5, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-static {v5, v8, v15}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぶでにく〼〳(Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 65
    sget-object v5, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 66
    check-cast v5, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-static {v5, v8, v14}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぶでにく〼〳(Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 67
    sget-object v5, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 68
    check-cast v5, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-static {v5, v8, v13}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぶでにく〼〳(Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 69
    sget-object v5, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 70
    check-cast v5, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-static {v5, v8, v7}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぶでにく〼〳(Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    iget-object v5, v0, Lteam/dev/epro/apkcustom/MainActivity$〺つふすそ;->づざかべべ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 71
    iget-object v5, v5, Lteam/dev/epro/apkcustom/MainActivity;->ながふずは:Ljava/lang/String;

    .line 72
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    sget-object v5, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 74
    check-cast v5, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v5}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->ぅばづそほせ()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, v0, Lteam/dev/epro/apkcustom/MainActivity$〺つふすそ;->づざかべべ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 75
    iget-object v5, v5, Lteam/dev/epro/apkcustom/MainActivity;->ながふずは:Ljava/lang/String;

    .line 76
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v5, v21

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    sget-object v21, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    move-object/from16 v27, v5

    .line 78
    move-object/from16 v5, v21

    check-cast v5, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-static {v5, v8, v7}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぶでにく〼〳(Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 79
    sget-object v5, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 80
    check-cast v5, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    move-object/from16 v21, v12

    move-object/from16 v12, v22

    invoke-static {v5, v8, v12}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->でどあくず(Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 81
    sget-object v5, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 82
    check-cast v5, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v5}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->ぅばづそほせ()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    sget-object v5, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 84
    check-cast v5, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    move-object/from16 v12, v25

    invoke-static {v5, v8, v12}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->でどあくず(Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 85
    sget-object v5, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 86
    check-cast v5, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-static {v5, v8, v7}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぶでにく〼〳(Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 87
    sget-object v5, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 88
    check-cast v5, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    move-object/from16 v12, v24

    invoke-static {v5, v8, v12}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->でどあくず(Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 89
    sget-object v5, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 90
    check-cast v5, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-static {v5, v8, v7}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぶでにく〼〳(Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 91
    sget-object v5, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 92
    check-cast v5, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    move-object/from16 v12, v23

    invoke-static {v5, v8, v12}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->でどあくず(Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 93
    sget-object v5, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 94
    check-cast v5, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-static {v5, v8, v9}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぶでにく〼〳(Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 95
    sget-object v5, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 96
    check-cast v5, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v5}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->ぅばづそほせ()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    sget-object v5, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 98
    check-cast v5, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-static {v5, v8, v11}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぶでにく〼〳(Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 99
    sget-object v5, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 100
    check-cast v5, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v5}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->ぅばづそほせ()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    sget-object v5, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 102
    check-cast v5, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-static {v5, v8, v9}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぶでにく〼〳(Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 103
    sget-object v5, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 104
    check-cast v5, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v5}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->ぅばづそほせ()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v5, v20

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    sget-object v20, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    move-object/from16 v23, v5

    .line 106
    move-object/from16 v5, v20

    check-cast v5, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-static {v5, v8, v11}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぶでにく〼〳(Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 107
    sget-object v5, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 108
    check-cast v5, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v5}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->ぅばづそほせ()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v8, 0x0

    aput-object v5, v1, v8

    iget-object v1, v0, Lteam/dev/epro/apkcustom/MainActivity$〺つふすそ;->づざかべべ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 109
    iget-boolean v1, v1, Lteam/dev/epro/apkcustom/MainActivity;->くねねぱす〻:Z

    if-nez v1, :cond_36a

    .line 110
    sget-object v1, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 111
    check-cast v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->ぅばづそほせ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v5, v28

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_361

    iget-object v1, v0, Lteam/dev/epro/apkcustom/MainActivity$〺つふすそ;->づざかべべ:Lteam/dev/epro/apkcustom/MainActivity;

    const/4 v8, 0x1

    .line 112
    iput-boolean v8, v1, Lteam/dev/epro/apkcustom/MainActivity;->くねねぱす〻:Z

    .line 113
    sget-object v1, Lteam/dev/epro/apkcustom/MainActivity;->へえどぜせ:Ljava/lang/String;

    sget-object v1, Lteam/dev/epro/apkcustom/MainActivity;->へえどぜせ:Ljava/lang/String;

    invoke-static/range {v17 .. v17}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    move-object/from16 v20, v10

    new-instance v10, Ljava/text/SimpleDateFormat;

    move-object/from16 v28, v11

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v11

    move-object/from16 v29, v2

    move-object/from16 v2, v16

    invoke-direct {v10, v2, v11}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    move-object/from16 v11, v19

    invoke-static {v10, v8, v11}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->なぶひせが(Ljava/text/SimpleDateFormat;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 114
    sget-object v10, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 115
    check-cast v10, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v10}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->ぅばづそほせ()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v10, v18

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v10, 0x1b9f

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v10, "N1m\u001bdhNg=N1lN3i\u0019j>\u001d7i\u001cg>AkiAfk\u001ckj\u001d0k\u001bfoA7i\u001cej\u00197k\u001c6<\u001ef=NdnK6m\u001d3mAjj\u001c1hJcm\u0019bm\u001a0m\u001c0f\u001adi\u001a7iNam\u001ceiOb<"

    invoke-static {v10}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v1, v8}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぃぜぶの〸ぃ(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_39f

    :cond_361
    move-object/from16 v29, v2

    move-object/from16 v20, v10

    move-object/from16 v28, v11

    move-object/from16 v2, v16

    goto :goto_374

    :cond_36a
    move-object/from16 v29, v2

    move-object/from16 v20, v10

    move-object/from16 v2, v16

    move-object/from16 v5, v28

    move-object/from16 v28, v11

    :goto_374
    move-object/from16 v11, v19

    .line 116
    sget-object v1, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 117
    check-cast v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->ぅばづそほせ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_39f

    iget-object v1, v0, Lteam/dev/epro/apkcustom/MainActivity$〺つふすそ;->づざかべべ:Lteam/dev/epro/apkcustom/MainActivity;

    const/4 v8, 0x0

    .line 118
    iput-boolean v8, v1, Lteam/dev/epro/apkcustom/MainActivity;->くねねぱす〻:Z

    goto :goto_39f

    :cond_38e
    move-object/from16 v29, v2

    move-object/from16 v28, v11

    move-object/from16 v2, v16

    move-object/from16 v27, v21

    move-object v11, v8

    move-object/from16 v21, v12

    move-object/from16 v12, v23

    move-object/from16 v23, v20

    move-object/from16 v20, v10

    .line 119
    :cond_39f
    :goto_39f
    sget-object v1, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 120
    check-cast v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->ぁないぼぎへ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_521

    iget-object v1, v0, Lteam/dev/epro/apkcustom/MainActivity$〺つふすそ;->〺つふすそ:[Ljava/lang/String;

    invoke-static/range {v26 .. v26}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    .line 121
    sget-object v10, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 122
    check-cast v10, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-static {v10, v8, v4}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ごづごきえ(Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 123
    sget-object v4, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 124
    check-cast v4, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-static {v4, v8, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ごづごきえ(Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 125
    sget-object v3, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 126
    check-cast v3, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-static {v3, v8, v15}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ごづごきえ(Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 127
    sget-object v3, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 128
    check-cast v3, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-static {v3, v8, v14}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ごづごきえ(Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 129
    sget-object v3, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 130
    check-cast v3, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-static {v3, v8, v13}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ごづごきえ(Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 131
    sget-object v3, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 132
    check-cast v3, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-static {v3, v8, v7}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ごづごきえ(Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    iget-object v3, v0, Lteam/dev/epro/apkcustom/MainActivity$〺つふすそ;->づざかべべ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 133
    iget-object v3, v3, Lteam/dev/epro/apkcustom/MainActivity;->ながふずは:Ljava/lang/String;

    .line 134
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v10, v21

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    sget-object v3, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 136
    check-cast v3, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v3}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->ぁないぼぎへ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v0, Lteam/dev/epro/apkcustom/MainActivity$〺つふすそ;->づざかべべ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 137
    iget-object v3, v3, Lteam/dev/epro/apkcustom/MainActivity;->ながふずは:Ljava/lang/String;

    .line 138
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v3, v27

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    sget-object v3, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 140
    check-cast v3, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-static {v3, v8, v7}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ごづごきえ(Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 141
    sget-object v3, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 142
    check-cast v3, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    move-object/from16 v4, v22

    invoke-static {v3, v8, v4}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->でどあくず(Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 143
    sget-object v3, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 144
    check-cast v3, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v3}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->ぁないぼぎへ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    sget-object v3, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 146
    check-cast v3, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    move-object/from16 v4, v25

    invoke-static {v3, v8, v4}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->でどあくず(Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 147
    sget-object v3, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 148
    check-cast v3, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-static {v3, v8, v7}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ごづごきえ(Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 149
    sget-object v3, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 150
    check-cast v3, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    move-object/from16 v4, v24

    invoke-static {v3, v8, v4}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->でどあくず(Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 151
    sget-object v3, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 152
    check-cast v3, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-static {v3, v8, v7}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ごづごきえ(Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 153
    sget-object v3, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 154
    check-cast v3, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-static {v3, v8, v12}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->でどあくず(Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 155
    sget-object v3, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 156
    check-cast v3, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-static {v3, v8, v9}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ごづごきえ(Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 157
    sget-object v3, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 158
    check-cast v3, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v3}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->ぁないぼぎへ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v3, v29

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    sget-object v4, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 160
    check-cast v4, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    move-object/from16 v6, v28

    invoke-static {v4, v8, v6}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ごづごきえ(Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 161
    sget-object v4, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 162
    check-cast v4, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v4}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->ぁないぼぎへ()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    sget-object v3, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 164
    check-cast v3, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-static {v3, v8, v9}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ごづごきえ(Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 165
    sget-object v3, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 166
    check-cast v3, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v3}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->ぁないぼぎへ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v3, v23

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    sget-object v3, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 168
    check-cast v3, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-static {v3, v8, v6}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ごづごきえ(Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 169
    sget-object v3, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 170
    check-cast v3, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v3}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->ぁないぼぎへ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v3, v20

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v1, v4

    iget-object v1, v0, Lteam/dev/epro/apkcustom/MainActivity$〺つふすそ;->づざかべべ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 171
    iget-boolean v1, v1, Lteam/dev/epro/apkcustom/MainActivity;->〱こか〺ぃせ:Z

    if-nez v1, :cond_50a

    .line 172
    sget-object v1, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 173
    check-cast v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->ぁないぼぎへ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_50a

    iget-object v1, v0, Lteam/dev/epro/apkcustom/MainActivity$〺つふすそ;->づざかべべ:Lteam/dev/epro/apkcustom/MainActivity;

    const/4 v3, 0x1

    .line 174
    iput-boolean v3, v1, Lteam/dev/epro/apkcustom/MainActivity;->〱こか〺ぃせ:Z

    .line 175
    sget-object v1, Lteam/dev/epro/apkcustom/MainActivity;->へえどぜせ:Ljava/lang/String;

    sget-object v1, Lteam/dev/epro/apkcustom/MainActivity;->へえどぜせ:Ljava/lang/String;

    invoke-static/range {v17 .. v17}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    new-instance v4, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v5

    invoke-direct {v4, v2, v5}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    invoke-static {v4, v3, v11}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->なぶひせが(Ljava/text/SimpleDateFormat;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 176
    sget-object v4, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 177
    check-cast v4, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v4}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->ぁないぼぎへ()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v4, v18

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v4, 0x1b9f

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, "N1m\u001bdhNg=N1lN3i\u0019j>\u001d7i\u001cg>AkiAfk\u001ckjH79\u001ak>\u001b`=\u001b`o\u001b7jM`<JagLbg@a<Kj;J`nKbi@7h\u0019f=J3oI6j\u00196>Jc:\u001c4n\u0019`i\u001e4:"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぃぜぶの〸ぃ(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_521

    .line 178
    :cond_50a
    sget-object v1, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 179
    check-cast v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->ぁないぼぎへ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_521

    iget-object v1, v0, Lteam/dev/epro/apkcustom/MainActivity$〺つふすそ;->づざかべべ:Lteam/dev/epro/apkcustom/MainActivity;

    const/4 v3, 0x0

    .line 180
    iput-boolean v3, v1, Lteam/dev/epro/apkcustom/MainActivity;->〱こか〺ぃせ:Z

    :cond_521
    :goto_521
    move-object/from16 v16, v2

    goto/16 :goto_642

    :cond_525
    move-object v2, v9

    move-object v1, v10

    move-object v8, v11

    move-object v10, v12

    move-object/from16 v30, v20

    move-object/from16 v31, v21

    move-object/from16 v9, v22

    move-object/from16 v12, v23

    move-object/from16 v11, v24

    .line 181
    sget-object v20, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 182
    check-cast v20, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual/range {v20 .. v20}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->せだてはぺて()Ljava/lang/String;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_642

    iget-object v5, v0, Lteam/dev/epro/apkcustom/MainActivity$〺つふすそ;->〺つふすそ:[Ljava/lang/String;

    const-string v9, "echo 1 >/proc/sys/net/ipv4/ip_forward\niptables -N vpnhotspot_fwd\niptables -t filter -I FORWARD -j vpnhotspot_fwd\niptables -t filter -I vpnhotspot_fwd -i "

    invoke-static {v9}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    .line 183
    sget-object v20, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    move-object/from16 v21, v5

    .line 184
    move-object/from16 v5, v20

    check-cast v5, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-static {v5, v9, v4}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぉ〲なぱぽた(Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 185
    sget-object v4, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 186
    check-cast v4, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-static {v4, v9, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぉ〲なぱぽた(Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 187
    sget-object v3, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 188
    check-cast v3, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-static {v3, v9, v15}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぉ〲なぱぽた(Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 189
    sget-object v3, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 190
    check-cast v3, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-static {v3, v9, v14}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぉ〲なぱぽた(Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 191
    sget-object v3, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 192
    check-cast v3, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-static {v3, v9, v13}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぉ〲なぱぽた(Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 193
    sget-object v3, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 194
    check-cast v3, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-static {v3, v9, v7}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぉ〲なぱぽた(Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    iget-object v3, v0, Lteam/dev/epro/apkcustom/MainActivity$〺つふすそ;->づざかべべ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 195
    iget-object v3, v3, Lteam/dev/epro/apkcustom/MainActivity;->ながふずは:Ljava/lang/String;

    .line 196
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    sget-object v3, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 198
    check-cast v3, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v3}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->せだてはぺて()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v0, Lteam/dev/epro/apkcustom/MainActivity$〺つふすそ;->づざかべべ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 199
    iget-object v3, v3, Lteam/dev/epro/apkcustom/MainActivity;->ながふずは:Ljava/lang/String;

    .line 200
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 201
    sget-object v3, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 202
    check-cast v3, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-static {v3, v9, v7}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぉ〲なぱぽた(Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 203
    sget-object v3, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 204
    check-cast v3, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-static {v3, v9, v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->でどあくず(Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 205
    sget-object v1, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 206
    check-cast v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->せだてはぺて()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 207
    sget-object v1, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 208
    check-cast v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-static {v1, v9, v2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->でどあくず(Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 209
    sget-object v1, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 210
    check-cast v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-static {v1, v9, v7}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぉ〲なぱぽた(Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 211
    sget-object v1, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 212
    check-cast v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-static {v1, v9, v11}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->でどあくず(Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 213
    sget-object v1, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 214
    check-cast v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-static {v1, v9, v7}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぉ〲なぱぽた(Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 215
    sget-object v1, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 216
    check-cast v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-static {v1, v9, v12}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->でどあくず(Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 217
    sget-object v1, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 218
    check-cast v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    move-object/from16 v2, v22

    invoke-static {v1, v9, v2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぉ〲なぱぽた(Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 219
    sget-object v1, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 220
    check-cast v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->せだてはぺて()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v31

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 221
    sget-object v3, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 222
    check-cast v3, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    move-object/from16 v4, v30

    invoke-static {v3, v9, v4}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぉ〲なぱぽた(Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 223
    sget-object v3, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 224
    check-cast v3, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v3}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->せだてはぺて()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 225
    sget-object v1, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 226
    check-cast v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-static {v1, v9, v2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぉ〲なぱぽた(Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 227
    sget-object v1, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 228
    check-cast v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->せだてはぺて()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v19

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    sget-object v1, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 230
    check-cast v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-static {v1, v9, v4}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぉ〲なぱぽた(Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 231
    sget-object v1, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 232
    check-cast v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->せだてはぺて()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v18

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v21, v2

    goto :goto_643

    :cond_642
    :goto_642
    const/4 v2, 0x0

    .line 233
    :goto_643
    sget-object v1, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 234
    iget-object v3, v0, Lteam/dev/epro/apkcustom/MainActivity$〺つふすそ;->〺つふすそ:[Ljava/lang/String;

    aget-object v3, v3, v2

    check-cast v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v1, v3}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->〴ぐち〱へ(Ljava/lang/String;)Z

    iget-object v1, v0, Lteam/dev/epro/apkcustom/MainActivity$〺つふすそ;->くし〴〺ぅ:[[Ljava/lang/String;

    iget-object v3, v0, Lteam/dev/epro/apkcustom/MainActivity$〺つふすそ;->〺つふすそ:[Ljava/lang/String;

    aget-object v3, v3, v2

    const-string v4, "\\n"

    invoke-virtual {v3, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v1, 0x0

    :goto_65d
    iget-object v3, v0, Lteam/dev/epro/apkcustom/MainActivity$〺つふすそ;->くし〴〺ぅ:[[Ljava/lang/String;

    aget-object v3, v3, v2

    array-length v3, v3

    if-ge v1, v3, :cond_667

    add-int/lit8 v1, v1, 0x1

    goto :goto_65d

    :cond_667
    iget-object v1, v0, Lteam/dev/epro/apkcustom/MainActivity$〺つふすそ;->〺つふすそ:[Ljava/lang/String;

    aget-object v1, v1, v2

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_6dc

    iget-object v1, v0, Lteam/dev/epro/apkcustom/MainActivity$〺つふすそ;->びぐびあび:Landroid/view/MenuItem;

    const/4 v2, 0x1

    invoke-interface {v1, v2}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    iget v1, v0, Lteam/dev/epro/apkcustom/MainActivity$〺つふすそ;->げつ〴ぬぐ:I

    const v2, 0x7f09025e

    if-ne v1, v2, :cond_68f

    .line 235
    sget-object v1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 236
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "\u0019a=\u0019`m\u00196g\u001ck<\u0019e;\u001bkkAc=\u001ef>I3j\u001d4mKa"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_69f

    .line 237
    :cond_68f
    sget-object v1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 238
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "Le=\u001969I7=J7nNbkH4=J19HfkM`;I3mHd"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :goto_69f
    const/4 v3, 0x1

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    sget-object v1, Lteam/dev/epro/apkcustom/MainActivity;->へえどぜせ:Ljava/lang/String;

    sget-object v1, Lteam/dev/epro/apkcustom/MainActivity;->へえどぜせ:Ljava/lang/String;

    invoke-static/range {v17 .. v17}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    new-instance v3, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v4

    move-object/from16 v5, v16

    invoke-direct {v3, v5, v4}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance v4, Ljava/util/Date;

    invoke-direct {v4}, Ljava/util/Date;-><init>()V

    invoke-virtual {v3, v4}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "Ij<Ng9A7:Jg9N0=\u001banHko\u001bd:IemOcm\u0019glN1k\u001d39A0>O`>\u0019`jJcnAd;LemI09@bl\u001ed=Obh\u001c4:\u001a0l\u001aff@1;Nkl\u001cfj\u001e7fNghAdg"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ざとぅぼこ〺(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_75f

    :cond_6dc
    move-object/from16 v5, v16

    iget v1, v0, Lteam/dev/epro/apkcustom/MainActivity$〺つふすそ;->げつ〴ぬぐ:I

    const v2, 0x7f09025f

    if-ne v1, v2, :cond_75f

    .line 239
    sget-object v1, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 240
    iget-object v2, v0, Lteam/dev/epro/apkcustom/MainActivity$〺つふすそ;->づざかべべ:Lteam/dev/epro/apkcustom/MainActivity;

    invoke-virtual {v2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v2

    const/4 v3, -0x1

    check-cast v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    const-string v4, "\u00193nOkh\u001eg>\u00196<H6>K3>\u001adh@jl\u001c4k\u001b4=Jk:\u001db9\u001aghA3hAg<KgmNdg\u001def\u001e`lJdh\u001b7iOa=J3j\u001d4iLk9I39\u001bcn\u001e`h\u001dbfIfnA4g\u0019f9"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v2, v4, v3}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->づおぴ〱いづ(Landroid/view/View;Ljava/lang/String;I)V

    sget-object v1, Lteam/dev/epro/apkcustom/MainActivity;->へえどぜせ:Ljava/lang/String;

    sget-object v1, Lteam/dev/epro/apkcustom/MainActivity;->へえどぜせ:Ljava/lang/String;

    invoke-static/range {v17 .. v17}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    new-instance v3, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v4

    invoke-direct {v3, v5, v4}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance v4, Ljava/util/Date;

    invoke-direct {v4}, Ljava/util/Date;-><init>()V

    invoke-virtual {v3, v4}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\u001akiKaiKaf\u001eejMeh\u00190m\u00197k\u001eafL6=@bh@j;O4oLf9Kc9\u001a0>L6;\u001b4k\u001dbmKak\u001a7jMc=I3lNe=J6jH0=K`<Ob;\u001c3m@4j\u001c`<M1;Nkg\u001e1f\u00191h\u001d3k\u001bamN3:\u001b6k@7f\u001b4j\u001abn@3mKd"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ざとぅぼこ〺(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_736
    iget-object v1, v0, Lteam/dev/epro/apkcustom/MainActivity$〺つふすそ;->づざかべべ:Lteam/dev/epro/apkcustom/MainActivity;

    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    iget-object v3, v0, Lteam/dev/epro/apkcustom/MainActivity$〺つふすそ;->づざかべべ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 241
    iget-object v4, v3, Lteam/dev/epro/apkcustom/MainActivity;->ぇいうげ〱〹:Ljava/lang/String;

    .line 242
    iget-object v3, v3, Lteam/dev/epro/apkcustom/MainActivity;->びちづぼぬ:Ljava/lang/String;

    .line 243
    invoke-virtual {v2, v4, v3}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_74a
    .catch Ljava/lang/Exception; {:try_start_736 .. :try_end_74a} :catch_74b

    goto :goto_75f

    :catch_74b
    :try_start_74b
    iget-object v1, v0, Lteam/dev/epro/apkcustom/MainActivity$〺つふすそ;->づざかべべ:Lteam/dev/epro/apkcustom/MainActivity;

    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    iget-object v3, v0, Lteam/dev/epro/apkcustom/MainActivity$〺つふすそ;->づざかべべ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 244
    iget-object v4, v3, Lteam/dev/epro/apkcustom/MainActivity;->ぇいうげ〱〹:Ljava/lang/String;

    .line 245
    iget-object v3, v3, Lteam/dev/epro/apkcustom/MainActivity;->ぉねぞはがぞ:Ljava/lang/String;

    .line 246
    invoke-virtual {v2, v4, v3}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_75f
    .catch Ljava/lang/Exception; {:try_start_74b .. :try_end_75f} :catch_75f

    :catch_75f
    :cond_75f
    :goto_75f
    iget-object v1, v0, Lteam/dev/epro/apkcustom/MainActivity$〺つふすそ;->〺つふすそ:[Ljava/lang/String;

    const-string v2, ""

    const/4 v3, 0x0

    aput-object v2, v1, v3

    return-void
.end method
