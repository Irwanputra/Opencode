.class public Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ$くし〴〺ぅ;
.super Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/なぎぱいぢぎ;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->〱こか〺ぃせ()Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/なぎぱいぢぎ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;


# direct methods
.method public constructor <init>(Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;)V
    .registers 2

    iput-object p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ$くし〴〺ぅ;->〺つふすそ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    invoke-direct {p0}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/なぎぱいぢぎ;-><init>()V

    return-void
.end method


# virtual methods
.method public げつ〴ぬぐ(Ljava/lang/ClassLoader;Ljava/lang/String;)Landroidx/fragment/app/Fragment;
    .registers 7

    iget-object p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ$くし〴〺ぅ;->〺つふすそ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    iget-object p1, p1, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->ぉざぅち〻:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;

    .line 1
    iget-object v0, p1, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;->くし〴〺ぅ:Landroid/content/Context;

    .line 2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    sget-object p1, Landroidx/fragment/app/Fragment;->こ〲しでおか:Ljava/lang/Object;

    const-string p1, ": make sure class name exists, is public, and has an empty constructor that is public"

    const-string v1, "Unable to instantiate fragment "

    :try_start_f
    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-static {v0, p2}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/なぎぱいぢぎ;->くし〴〺ぅ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Class;

    invoke-virtual {v0, v3}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/Fragment;
    :try_end_26
    .catch Ljava/lang/InstantiationException; {:try_start_f .. :try_end_26} :catch_4c
    .catch Ljava/lang/IllegalAccessException; {:try_start_f .. :try_end_26} :catch_41
    .catch Ljava/lang/NoSuchMethodException; {:try_start_f .. :try_end_26} :catch_34
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_f .. :try_end_26} :catch_27

    return-object v0

    :catch_27
    move-exception p1

    new-instance v0, Landroidx/fragment/app/Fragment$〺つふすそ;

    const-string v2, ": calling Fragment constructor caused an exception"

    invoke-static {v1, p2, v2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->くし〴〺ぅ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, p2, p1}, Landroidx/fragment/app/Fragment$〺つふすそ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v0

    :catch_34
    move-exception p1

    new-instance v0, Landroidx/fragment/app/Fragment$〺つふすそ;

    const-string v2, ": could not find Fragment constructor"

    invoke-static {v1, p2, v2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->くし〴〺ぅ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, p2, p1}, Landroidx/fragment/app/Fragment$〺つふすそ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v0

    :catch_41
    move-exception v0

    new-instance v2, Landroidx/fragment/app/Fragment$〺つふすそ;

    invoke-static {v1, p2, p1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->くし〴〺ぅ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1, v0}, Landroidx/fragment/app/Fragment$〺つふすそ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v2

    :catch_4c
    move-exception v0

    new-instance v2, Landroidx/fragment/app/Fragment$〺つふすそ;

    invoke-static {v1, p2, p1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->くし〴〺ぅ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1, v0}, Landroidx/fragment/app/Fragment$〺つふすそ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v2
.end method
