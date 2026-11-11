.class public Lteam/dev/epro/apkcustom/MainActivity$ぺふねづ〺;
.super Landroid/content/BroadcastReceiver;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lteam/dev/epro/apkcustom/MainActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic げつ〴ぬぐ:Lteam/dev/epro/apkcustom/MainActivity;


# direct methods
.method public constructor <init>(Lteam/dev/epro/apkcustom/MainActivity;)V
    .registers 2

    iput-object p1, p0, Lteam/dev/epro/apkcustom/MainActivity$ぺふねづ〺;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/MainActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .registers 16

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    const-string p2, "I4>Jbo@flJb;N4jAblOjmJgmJc=K6>Je:\u001c1o@3n\u0019`9\u001adhIfjHk<M1h\u00193fMalI`jN`i\u001dbhK3;I3:\u001cjgK4mKflKknMb9\u001b4:Ke:"

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_16

    goto :goto_48

    :cond_16
    const-string v0, "I4>Jbo@flJb;N4jAblOjmJgmJc=K6>Je>IejMc9Le>\u0019j=\u001ebnOen\u001a1iO79O4:Oj<K6:\u001dggHciMbm\u001d3o\u001b7>\u001ek=\u001ebi\u001dfm\u001ajl\u0019b;"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_27

    goto :goto_48

    :cond_27
    const-string v0, "I4>Jbo@flJb;N4jAblOjmJgmJc=K6>Je9\u001cb9\u001bbo@6;M6mM7:Na=A1o\u001bgkO7hLdhKg;J0k\u001d6fO7jL4>J`=\u001bc>HbhLf=I3oIdg"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_38

    goto :goto_48

    :cond_38
    const-string v0, "I4>Jbo@flJb;N4jAblOjmJgmJc=K6>JejKf>J`g@fiJkk\u001cak@ko\u001efjHaiA7l\u001d`f\u001d39\u0019c9\u001aflJ3kH1nL7>\u00193:Mj>M6kOfh\u00197="

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4c

    :goto_48
    iget-object v0, p0, Lteam/dev/epro/apkcustom/MainActivity$ぺふねづ〺;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 2
    iput-boolean v1, v0, Lteam/dev/epro/apkcustom/MainActivity;->のびぶけせ:Z

    :cond_4c
    const-string v0, "Ad9A3>\u001deh\u0019emMbgHkjK19Ac=K`gM6l\u001bf=M6=NjnL4hKg=Mfl\u001e`iI0<Hfl\u001cahO`i\u0019`=Lam\u001eb=Iem@k9\u001b`>K1mNgj\u001969\u001e0hNgh"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v2, "I4>Jbo@flJb;N4jAblOjmJgmJc=K6>Je9LkgH`hIbiL6m\u001af;\u001dcm\u001dakIb>\u001demN3=La<\u001b7<LjiLdo\u001c4nI1jA1g@do\u001egm\u001b4=Nk>"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "Ad9A3>\u001deh\u0019emMbgHkjK19Ac=K`gM6l\u001bfh\u001c0<\u001be=\u001e0;Id<K7lAc;\u001e0gA7;\u001d4hN1gJ3=\u001b7lJcj\u001d3i\u0019bkO6f\u001dfhIenOk9OjfMc9"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-nez v0, :cond_93

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_93

    const-string v0, "I4>Jbo@flJb;N4jAblOjmJgmJc=K6>JelM3k\u001b3f\u001d3h\u001dekH1gIa=\u001bbnOa=\u001c3:Lf=Ja9\u001bg;He;HkfO7>HeoN4l\u001d7mN3iHefIg;"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_93

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_93

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_93

    return-void

    :cond_93
    iget-object v0, p0, Lteam/dev/epro/apkcustom/MainActivity$ぺふねづ〺;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 4
    iget-object v4, v0, Lteam/dev/epro/apkcustom/MainActivity;->ごまけがぢは:Ljava/lang/String;

    .line 5
    sget-object v5, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 6
    check-cast v5, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v5, v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->〱〵つてう(Landroid/content/Context;)Z

    move-result v0

    const-string v5, "Ak;Ic:\u001a4gMfj\u001dj;Mb:K4n@jk\u00196m\u001ec>J1i\u001de=\u001bal@fmJ4:J0<@gh\u001ejoAe;J3k\u001aj>A"

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "\u001d4f\u001b6mM3i\u001aehN`hIf:Lc9\u0019aoHeiA4oIc"

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "Jc;\u001djhKgjAb:H49Le:KdjMe9\u001cflIal\u001ck"

    invoke-static {v7}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "JbgNg9K3fHcn\u001cfiNaiJ3kI7m\u00194>\u001979\u001b6"

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    if-eqz v0, :cond_10f

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v9, p0, Lteam/dev/epro/apkcustom/MainActivity$ぺふねづ〺;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 7
    invoke-virtual {v9}, Lteam/dev/epro/apkcustom/MainActivity;->えがぐせほち()Ljava/lang/String;

    move-result-object v9

    .line 8
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v9, p0, Lteam/dev/epro/apkcustom/MainActivity$ぺふねづ〺;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 9
    invoke-virtual {v9}, Lteam/dev/epro/apkcustom/MainActivity;->ち〴みぎ〻び()Ljava/lang/String;

    move-result-object v9

    .line 10
    invoke-virtual {v9}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    sget-object v9, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 12
    iget-object v10, p0, Lteam/dev/epro/apkcustom/MainActivity$ぺふねづ〺;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/MainActivity;

    check-cast v9, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v9, v10}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->がぐくいおす(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    sget-object v9, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 14
    iget-object v10, p0, Lteam/dev/epro/apkcustom/MainActivity$ぺふねづ〺;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/MainActivity;

    check-cast v9, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v9, v10}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->へ〱そかのず(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_127

    .line 15
    :cond_10f
    sget-object v0, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 16
    iget-object v9, p0, Lteam/dev/epro/apkcustom/MainActivity$ぺふねづ〺;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/MainActivity;

    check-cast v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v0, v9}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->〻しざ〹おま(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_126

    .line 17
    sget-object v0, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 18
    iget-object v9, p0, Lteam/dev/epro/apkcustom/MainActivity$ぺふねづ〺;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/MainActivity;

    check-cast v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v0, v9}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->つしけおつ(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    goto :goto_127

    :cond_126
    move-object v0, v5

    :goto_127
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v4, "\u00190:Acn\u001d0j\u001bcmA`k\u001a6mJbgJ3fKcfAkmJ0"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v9, "L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1"

    invoke-static {v9}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    if-nez v0, :cond_23d

    iget-object v0, p0, Lteam/dev/epro/apkcustom/MainActivity$ぺふねづ〺;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 19
    sget-object v10, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 20
    check-cast v10, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v10, v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->〱〵つてう(Landroid/content/Context;)Z

    move-result v10

    if-eqz v10, :cond_193

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v11, p0, Lteam/dev/epro/apkcustom/MainActivity$ぺふねづ〺;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 21
    invoke-virtual {v11}, Lteam/dev/epro/apkcustom/MainActivity;->えがぐせほち()Ljava/lang/String;

    move-result-object v11

    .line 22
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v11, p0, Lteam/dev/epro/apkcustom/MainActivity$ぺふねづ〺;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 23
    invoke-virtual {v11}, Lteam/dev/epro/apkcustom/MainActivity;->ち〴みぎ〻び()Ljava/lang/String;

    move-result-object v11

    .line 24
    invoke-virtual {v11}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    sget-object v11, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 26
    iget-object v12, p0, Lteam/dev/epro/apkcustom/MainActivity$ぺふねづ〺;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/MainActivity;

    check-cast v11, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v11, v12}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->がぐくいおす(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    sget-object v11, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 28
    iget-object v12, p0, Lteam/dev/epro/apkcustom/MainActivity$ぺふねづ〺;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/MainActivity;

    check-cast v11, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v11, v12}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->へ〱そかのず(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    goto :goto_1ab

    .line 29
    :cond_193
    sget-object v10, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 30
    iget-object v11, p0, Lteam/dev/epro/apkcustom/MainActivity$ぺふねづ〺;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/MainActivity;

    check-cast v10, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v10, v11}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->〻しざ〹おま(Landroid/content/Context;)Z

    move-result v10

    if-eqz v10, :cond_1aa

    .line 31
    sget-object v10, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 32
    iget-object v11, p0, Lteam/dev/epro/apkcustom/MainActivity$ぺふねづ〺;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/MainActivity;

    check-cast v10, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v10, v11}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->つしけおつ(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v10

    goto :goto_1ab

    :cond_1aa
    move-object v10, v5

    .line 33
    :goto_1ab
    iput-object v10, v0, Lteam/dev/epro/apkcustom/MainActivity;->ごまけがぢは:Ljava/lang/String;

    .line 34
    sget-object v0, Lteam/dev/epro/apkcustom/MainActivity;->へえどぜせ:Ljava/lang/String;

    sget-object v0, Lteam/dev/epro/apkcustom/MainActivity;->へえどぜせ:Ljava/lang/String;

    invoke-static {v9}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    new-instance v11, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v12

    invoke-direct {v11, v4, v12}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    const-string v12, "\u001dg;JjmH`mA`oN4hK3=@1mNd>Nf=\u001cf;Hc"

    invoke-static {v12}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v11, v10, v12}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->なぶひせが(Ljava/text/SimpleDateFormat;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 35
    sget-object v11, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 36
    iget-object v12, p0, Lteam/dev/epro/apkcustom/MainActivity$ぺふねづ〺;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/MainActivity;

    check-cast v11, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v11, v12}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->〱〵つてう(Landroid/content/Context;)Z

    move-result v11

    if-eqz v11, :cond_21d

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v11, p0, Lteam/dev/epro/apkcustom/MainActivity$ぺふねづ〺;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 37
    invoke-virtual {v11}, Lteam/dev/epro/apkcustom/MainActivity;->えがぐせほち()Ljava/lang/String;

    move-result-object v11

    .line 38
    invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v11, p0, Lteam/dev/epro/apkcustom/MainActivity$ぺふねづ〺;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 39
    invoke-virtual {v11}, Lteam/dev/epro/apkcustom/MainActivity;->ち〴みぎ〻び()Ljava/lang/String;

    move-result-object v11

    .line 40
    invoke-virtual {v11}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    sget-object v7, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 42
    iget-object v11, p0, Lteam/dev/epro/apkcustom/MainActivity$ぺふねづ〺;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/MainActivity;

    check-cast v7, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v7, v11}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->がぐくいおす(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    sget-object v7, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 44
    iget-object v8, p0, Lteam/dev/epro/apkcustom/MainActivity$ぺふねづ〺;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/MainActivity;

    check-cast v7, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v7, v8}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->へ〱そかのず(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    goto :goto_233

    .line 45
    :cond_21d
    sget-object v6, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 46
    iget-object v7, p0, Lteam/dev/epro/apkcustom/MainActivity$ぺふねづ〺;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/MainActivity;

    check-cast v6, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v6, v7}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->〻しざ〹おま(Landroid/content/Context;)Z

    move-result v6

    if-eqz v6, :cond_233

    .line 47
    sget-object v5, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 48
    iget-object v6, p0, Lteam/dev/epro/apkcustom/MainActivity$ぺふねづ〺;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/MainActivity;

    check-cast v5, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v5, v6}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->つしけおつ(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    :cond_233
    :goto_233
    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v0, v5}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぃぜぶの〸ぃ(Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    :cond_23d
    sget-object v0, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 50
    iget-object v5, p0, Lteam/dev/epro/apkcustom/MainActivity$ぺふねづ〺;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/MainActivity;

    check-cast v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v0, v5}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->〱〵つてう(Landroid/content/Context;)Z

    move-result v0

    const-string v5, ""

    if-eqz v0, :cond_29d

    iget-object v0, p0, Lteam/dev/epro/apkcustom/MainActivity$ぺふねづ〺;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 51
    sget-object v6, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 52
    check-cast v6, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    .line 53
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_254
    invoke-static {}, Ljava/net/NetworkInterface;->getNetworkInterfaces()Ljava/util/Enumeration;

    move-result-object v6

    :cond_258
    invoke-interface {v6}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v7

    if-eqz v7, :cond_2fa

    invoke-interface {v6}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/net/NetworkInterface;

    invoke-virtual {v7}, Ljava/net/NetworkInterface;->getInetAddresses()Ljava/util/Enumeration;

    move-result-object v8

    :cond_268
    invoke-interface {v8}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v10

    if-eqz v10, :cond_258

    invoke-interface {v8}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/net/InetAddress;

    invoke-virtual {v10}, Ljava/net/InetAddress;->isLoopbackAddress()Z

    move-result v11

    if-nez v11, :cond_268

    instance-of v10, v10, Ljava/net/Inet4Address;

    if-eqz v10, :cond_268

    invoke-virtual {v7}, Ljava/net/NetworkInterface;->isUp()Z

    move-result v10

    if-eqz v10, :cond_268

    invoke-virtual {v7}, Ljava/net/NetworkInterface;->getDisplayName()Ljava/lang/String;

    move-result-object v10

    const-string v11, "Lb;O1nIgl@ggH6j\u001dbm\u001cflMamOe=OaiI6"

    invoke-static {v11}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_268

    invoke-virtual {v7}, Ljava/net/NetworkInterface;->getDisplayName()Ljava/lang/String;

    move-result-object v5
    :try_end_29c
    .catch Ljava/lang/Exception; {:try_start_254 .. :try_end_29c} :catch_2fa

    goto :goto_2fa

    .line 54
    :cond_29d
    sget-object v0, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 55
    iget-object v6, p0, Lteam/dev/epro/apkcustom/MainActivity$ぺふねづ〺;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/MainActivity;

    check-cast v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v0, v6}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->〻しざ〹おま(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2fc

    iget-object v0, p0, Lteam/dev/epro/apkcustom/MainActivity$ぺふねづ〺;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 56
    sget-object v6, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 57
    check-cast v6, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    .line 58
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_2b2
    invoke-static {}, Ljava/net/NetworkInterface;->getNetworkInterfaces()Ljava/util/Enumeration;

    move-result-object v6

    :cond_2b6
    invoke-interface {v6}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v7

    if-eqz v7, :cond_2fa

    invoke-interface {v6}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/net/NetworkInterface;

    invoke-virtual {v7}, Ljava/net/NetworkInterface;->getInetAddresses()Ljava/util/Enumeration;

    move-result-object v8

    :cond_2c6
    invoke-interface {v8}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v10

    if-eqz v10, :cond_2b6

    invoke-interface {v8}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/net/InetAddress;

    invoke-virtual {v10}, Ljava/net/InetAddress;->isLoopbackAddress()Z

    move-result v11

    if-nez v11, :cond_2c6

    instance-of v10, v10, Ljava/net/Inet4Address;

    if-eqz v10, :cond_2c6

    invoke-virtual {v7}, Ljava/net/NetworkInterface;->isUp()Z

    move-result v10

    if-eqz v10, :cond_2c6

    invoke-virtual {v7}, Ljava/net/NetworkInterface;->getDisplayName()Ljava/lang/String;

    move-result-object v10

    const-string v11, "\u001dboLanL69Lb9A4iKghHcf\u00194oK19\u001c`g\u0019f"

    invoke-static {v11}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_2c6

    invoke-virtual {v7}, Ljava/net/NetworkInterface;->getDisplayName()Ljava/lang/String;

    move-result-object v5
    :try_end_2fa
    .catch Ljava/lang/Exception; {:try_start_2b2 .. :try_end_2fa} :catch_2fa

    .line 59
    :catch_2fa
    :cond_2fa
    :goto_2fa
    iput-object v5, v0, Lteam/dev/epro/apkcustom/MainActivity;->ながふずは:Ljava/lang/String;

    .line 60
    :cond_2fc
    sget-object v0, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 61
    iget-object v5, p0, Lteam/dev/epro/apkcustom/MainActivity$ぺふねづ〺;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/MainActivity;

    check-cast v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v0, v5}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->〻しざ〹おま(Landroid/content/Context;)Z

    move-result v0

    const-string v5, "HaiAehO0gJ1i\u00190;M7>\u001eg;\u0019`9\u001b`lH1k\u001eb"

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-nez v0, :cond_31e

    .line 62
    sget-object v0, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 63
    iget-object v6, p0, Lteam/dev/epro/apkcustom/MainActivity$ぺふねづ〺;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/MainActivity;

    check-cast v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v0, v6}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->〱〵つてう(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_37a

    :cond_31e
    iget-object v0, p0, Lteam/dev/epro/apkcustom/MainActivity$ぺふねづ〺;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 64
    iget-object v0, v0, Lteam/dev/epro/apkcustom/MainActivity;->こ〲しでおか:Ljava/lang/String;

    .line 65
    sget-object v6, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 66
    check-cast v6, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v6}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->しぷげへが()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_37a

    iget-object v0, p0, Lteam/dev/epro/apkcustom/MainActivity$ぺふねづ〺;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 67
    sget-object v6, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 68
    check-cast v6, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v6}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->しぷげへが()Ljava/lang/String;

    move-result-object v6

    .line 69
    iput-object v6, v0, Lteam/dev/epro/apkcustom/MainActivity;->こ〲しでおか:Ljava/lang/String;

    .line 70
    sget-object v0, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 71
    check-cast v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->しぷげへが()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_37a

    sget-object v0, Lteam/dev/epro/apkcustom/MainActivity;->へえどぜせ:Ljava/lang/String;

    sget-object v0, Lteam/dev/epro/apkcustom/MainActivity;->へえどぜせ:Ljava/lang/String;

    invoke-static {v9}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    new-instance v7, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v8

    invoke-direct {v7, v4, v8}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    const-string v8, "\u0019a>Jfn\u001ca;\u001dc<\u001b0oIegHc:L4iN4g\u001c3hAd"

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v6, v8}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->なぶひせが(Ljava/text/SimpleDateFormat;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 72
    sget-object v7, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 73
    check-cast v7, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v7}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->しぷげへが()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v0, v6}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぃぜぶの〸ぃ(Ljava/lang/String;Ljava/lang/String;)V

    :cond_37a
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_38c

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_38c

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_565

    :cond_38c
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    const/16 p2, 0x1b9f

    const-string v0, "M6i@cg\u0019g<A`k\u0019go\u001abmLe9\u001e6;Men\u001edfO3"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "Aj9@b9Agl\u00191gM`<K7j\u001bd;\u001aaj@a=Lbn\u001d1o\u001ejmMji\u00191;\u001e7oH6oAfh\u001akj@7iJ1mAgl\u001a"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz p1, :cond_421

    .line 74
    sget-object p1, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 75
    iget-object v6, p0, Lteam/dev/epro/apkcustom/MainActivity$ぺふねづ〺;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/MainActivity;

    check-cast p1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {p1, v6}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->〻しざ〹おま(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_421

    iget-object p1, p0, Lteam/dev/epro/apkcustom/MainActivity$ぺふねづ〺;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 76
    iget-boolean p1, p1, Lteam/dev/epro/apkcustom/MainActivity;->ぺがぅす〹ち:Z

    if-nez p1, :cond_40b

    .line 77
    sget-object p1, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 78
    check-cast p1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->へえどぜせ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_40b

    iget-object p1, p0, Lteam/dev/epro/apkcustom/MainActivity$ぺふねづ〺;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 79
    iput-boolean v1, p1, Lteam/dev/epro/apkcustom/MainActivity;->ぺがぅす〹ち:Z

    .line 80
    sget-object p1, Lteam/dev/epro/apkcustom/MainActivity;->へえどぜせ:Ljava/lang/String;

    sget-object p1, Lteam/dev/epro/apkcustom/MainActivity;->へえどぜせ:Ljava/lang/String;

    invoke-static {v9}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    new-instance v7, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v8

    invoke-direct {v7, v4, v8}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    invoke-static {v7, v6, v2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->なぶひせが(Ljava/text/SimpleDateFormat;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 81
    sget-object v7, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 82
    check-cast v7, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v7}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->へえどぜせ()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, "N1m\u001bdhNg=N1lN3i\u0019j>\u001d7i\u001cg>AkiAfk\u001cki\u001e0kK0iO3n@1gJdk@7<MchJ4oAbf\u001949\u0019eo@bl\u001e4mI1iOd<J3g\u001cgl\u001def\u001e7kAdh\u001cco"

    invoke-static {v7}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {p1, v6}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぃぜぶの〸ぃ(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_421

    .line 83
    :cond_40b
    sget-object p1, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 84
    check-cast p1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->へえどぜせ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_421

    iget-object p1, p0, Lteam/dev/epro/apkcustom/MainActivity$ぺふねづ〺;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 85
    iput-boolean v3, p1, Lteam/dev/epro/apkcustom/MainActivity;->ぺがぅす〹ち:Z

    .line 86
    :cond_421
    :goto_421
    iget-object p1, p0, Lteam/dev/epro/apkcustom/MainActivity$ぺふねづ〺;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 87
    iget-boolean p1, p1, Lteam/dev/epro/apkcustom/MainActivity;->くねねぱす〻:Z

    if-nez p1, :cond_477

    .line 88
    sget-object p1, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 89
    check-cast p1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->ぅばづそほせ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_477

    iget-object p1, p0, Lteam/dev/epro/apkcustom/MainActivity$ぺふねづ〺;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 90
    iput-boolean v1, p1, Lteam/dev/epro/apkcustom/MainActivity;->くねねぱす〻:Z

    .line 91
    sget-object p1, Lteam/dev/epro/apkcustom/MainActivity;->へえどぜせ:Ljava/lang/String;

    sget-object p1, Lteam/dev/epro/apkcustom/MainActivity;->へえどぜせ:Ljava/lang/String;

    invoke-static {v9}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    new-instance v7, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v8

    invoke-direct {v7, v4, v8}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    invoke-static {v7, v6, v2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->なぶひせが(Ljava/text/SimpleDateFormat;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 92
    sget-object v7, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 93
    check-cast v7, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v7}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->ぅばづそほせ()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, "N1m\u001bdhNg=N1lN3i\u0019j>\u001d7i\u001cg>AkiAfk\u001ckj\u001d0k\u001bfoA7i\u001cej\u00197k\u001c6<\u001ef=NdnK6m\u001d3mAjj\u001c1hJcm\u0019bm\u001a0m\u001c0f\u001adi\u001a7iNam\u001ceiOb<"

    invoke-static {v7}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {p1, v6}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぃぜぶの〸ぃ(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_48d

    .line 94
    :cond_477
    sget-object p1, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 95
    check-cast p1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->ぅばづそほせ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_48d

    iget-object p1, p0, Lteam/dev/epro/apkcustom/MainActivity$ぺふねづ〺;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 96
    iput-boolean v3, p1, Lteam/dev/epro/apkcustom/MainActivity;->くねねぱす〻:Z

    .line 97
    :cond_48d
    :goto_48d
    iget-object p1, p0, Lteam/dev/epro/apkcustom/MainActivity$ぺふねづ〺;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 98
    iget-boolean p1, p1, Lteam/dev/epro/apkcustom/MainActivity;->〱こか〺ぃせ:Z

    if-nez p1, :cond_4e3

    .line 99
    sget-object p1, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 100
    check-cast p1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->ぁないぼぎへ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4e3

    iget-object p1, p0, Lteam/dev/epro/apkcustom/MainActivity$ぺふねづ〺;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 101
    iput-boolean v1, p1, Lteam/dev/epro/apkcustom/MainActivity;->〱こか〺ぃせ:Z

    .line 102
    sget-object p1, Lteam/dev/epro/apkcustom/MainActivity;->へえどぜせ:Ljava/lang/String;

    sget-object p1, Lteam/dev/epro/apkcustom/MainActivity;->へえどぜせ:Ljava/lang/String;

    invoke-static {v9}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    new-instance v7, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v8

    invoke-direct {v7, v4, v8}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    invoke-static {v7, v6, v2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->なぶひせが(Ljava/text/SimpleDateFormat;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 103
    sget-object v7, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 104
    check-cast v7, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v7}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->ぁないぼぎへ()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, "N1m\u001bdhNg=N1lN3i\u0019j>\u001d7i\u001cg>AkiAfk\u001ckjH79\u001ak>\u001b`=\u001b`o\u001b7jM`<JagLbg@a<Kj;J`nKbi@7h\u0019f=J3oI6j\u00196>Jc:\u001c4n\u0019`i\u001e4:"

    invoke-static {v7}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {p1, v6}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぃぜぶの〸ぃ(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_4f9

    .line 105
    :cond_4e3
    sget-object p1, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 106
    check-cast p1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->ぁないぼぎへ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4f9

    iget-object p1, p0, Lteam/dev/epro/apkcustom/MainActivity$ぺふねづ〺;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 107
    iput-boolean v3, p1, Lteam/dev/epro/apkcustom/MainActivity;->〱こか〺ぃせ:Z

    .line 108
    :cond_4f9
    :goto_4f9
    iget-object p1, p0, Lteam/dev/epro/apkcustom/MainActivity$ぺふねづ〺;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 109
    iget-boolean p1, p1, Lteam/dev/epro/apkcustom/MainActivity;->のね〱ばぁぢ:Z

    if-nez p1, :cond_54f

    .line 110
    sget-object p1, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 111
    check-cast p1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->せだてはぺて()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_54f

    iget-object p1, p0, Lteam/dev/epro/apkcustom/MainActivity$ぺふねづ〺;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 112
    iput-boolean v1, p1, Lteam/dev/epro/apkcustom/MainActivity;->のね〱ばぁぢ:Z

    .line 113
    sget-object p1, Lteam/dev/epro/apkcustom/MainActivity;->へえどぜせ:Ljava/lang/String;

    sget-object p1, Lteam/dev/epro/apkcustom/MainActivity;->へえどぜせ:Ljava/lang/String;

    invoke-static {v9}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    new-instance v3, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    invoke-static {v3, v1, v2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->なぶひせが(Ljava/text/SimpleDateFormat;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 114
    sget-object v2, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 115
    check-cast v2, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->せだてはぺて()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, "N1m\u001bdhNg=N1lN3i\u0019j>\u001d7i\u001cg>AkiAfk\u001ckj\u001afg\u001bfkMcoO4nAg9JfiK7g\u001dg>OflI6k\u001e3g\u001b`jIjn\u001bg:\u001dai\u001d3mOj>Ie:MjlHg=I7o"

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぃぜぶの〸ぃ(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_565

    .line 116
    :cond_54f
    sget-object p1, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 117
    check-cast p1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->せだてはぺて()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_565

    iget-object p1, p0, Lteam/dev/epro/apkcustom/MainActivity$ぺふねづ〺;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 118
    iput-boolean v3, p1, Lteam/dev/epro/apkcustom/MainActivity;->のね〱ばぁぢ:Z

    :cond_565
    :goto_565
    return-void
.end method
