.class public Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぇぬぎばつ;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぇぬぎばつ$〺つふすそ;
    }
.end annotation


# static fields
.field public static びぐびあび:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぇぬぎばつ;


# instance fields
.field public 〺つふすそ:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "L\u3041\u3054\u3050\u3059\u3059\u3043/\u3052\u3064\u3034\u306c\u3050/\u3052\u3064\u3034\u306c\u3050/\u3041\u3054\u3050\u3059\u3059\u3043/\u3047\u306c\u304e\u3070\u3064$\u303a\u3064\u3075\u3059\u305d;",
            ">;"
        }
    .end annotation
.end field

.field public くし〴〺ぅ:Landroid/content/BroadcastReceiver;

.field public げつ〴ぬぐ:Landroid/content/Context;


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぇぬぎばつ;->〺つふすそ:Ljava/util/Set;

    new-instance v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぇぬぎばつ$げつ〴ぬぐ;

    invoke-direct {v0, p0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぇぬぎばつ$げつ〴ぬぐ;-><init>(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぇぬぎばつ;)V

    iput-object v0, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぇぬぎばつ;->くし〴〺ぅ:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method public static 〺つふすそ()Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぇぬぎばつ;
    .registers 1

    sget-object v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぇぬぎばつ;->びぐびあび:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぇぬぎばつ;

    if-nez v0, :cond_b

    new-instance v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぇぬぎばつ;

    invoke-direct {v0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぇぬぎばつ;-><init>()V

    sput-object v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぇぬぎばつ;->びぐびあび:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぇぬぎばつ;

    :cond_b
    sget-object v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぇぬぎばつ;->びぐびあび:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぇぬぎばつ;

    return-object v0
.end method

.method public static げつ〴ぬぐ(Landroid/content/Context;)Z
    .registers 4

    .line 1
    new-instance v0, Landroid/content/Intent;

    const-string v1, "NfkHc9@3<J6iL3g\u0019c9\u00190oO6nO4k\u001eg9\u001dajHf9IekA3mHjg\u001e`n\u001b`;\u001ekkI7>\u001e4gK4iMdf\u001b4jA`:M4oJffK79LakMg>Ne=\u001c0nHei"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "NfkHc9@3<J6iL3g\u0019c9\u00190oO6nO4k\u001eg9\u001damLfo\u001e`k\u001e`gM`9\u001e7>\u0019eg\u0019`>Nd:O6o\u001e`n\u001e"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "NfkHc9@3<J6iL3g\u0019c9\u00190oO6nO4k\u001eg9\u001dal\u001bdlHai\u001a7oO4fK`kN7lO`<M3fN69\u001ebh\u001ag;\u001ed<OahI09\u00190<IcgM`l\u001b`oKbfO`o\u001bjiIag\u001abgO3nN7i\u001bk<\u0019ek\u001c7m\u0019`;\u001cbg\u001edk@6"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 2
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/pm/PackageManager;->queryBroadcastReceivers(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object p0

    if-eqz p0, :cond_3f

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    if-lez p0, :cond_3f

    const/4 v1, 0x1

    :cond_3f
    return v1
.end method


# virtual methods
.method public declared-synchronized くし〴〺ぅ(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぇぬぎばつ$〺つふすそ;)V
    .registers 3

    monitor-enter p0

    :try_start_1
    iget-object v0, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぇぬぎばつ;->〺つふすそ:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    iget-object p1, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぇぬぎばつ;->〺つふすそ:Ljava/util/Set;

    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result p1

    if-nez p1, :cond_15

    iget-object p1, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぇぬぎばつ;->げつ〴ぬぐ:Landroid/content/Context;

    iget-object v0, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぇぬぎばつ;->くし〴〺ぅ:Landroid/content/BroadcastReceiver;

    invoke-virtual {p1, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_15
    .catchall {:try_start_1 .. :try_end_15} :catchall_17

    :cond_15
    monitor-exit p0

    return-void

    :catchall_17
    move-exception p1

    monitor-exit p0

    throw p1
.end method
