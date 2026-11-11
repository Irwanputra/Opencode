.class public Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final 〺つふすそ:Landroid/database/ContentObserver;

.field public くし〴〺ぅ:Landroid/os/Vibrator;

.field public final げつ〴ぬぐ:Landroid/content/Context;

.field public づざかべべ:Z

.field public なぎぱいぢぎ:J

.field public びぐびあび:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/content/Context;

    new-instance p1, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;-><init>(Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/げつ〴ぬぐ;Landroid/os/Handler;)V

    iput-object p1, p0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ:Landroid/database/ContentObserver;

    return-void
.end method


# virtual methods
.method public げつ〴ぬぐ()V
    .registers 8

    iget-object v0, p0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/げつ〴ぬぐ;->くし〴〺ぅ:Landroid/os/Vibrator;

    if-eqz v0, :cond_23

    iget-boolean v0, p0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/げつ〴ぬぐ;->びぐびあび:Z

    if-eqz v0, :cond_23

    iget-boolean v0, p0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/げつ〴ぬぐ;->づざかべべ:Z

    if-eqz v0, :cond_23

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/げつ〴ぬぐ;->なぎぱいぢぎ:J

    sub-long v2, v0, v2

    const-wide/16 v4, 0x7d

    cmp-long v6, v2, v4

    if-ltz v6, :cond_23

    iget-object v2, p0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/げつ〴ぬぐ;->くし〴〺ぅ:Landroid/os/Vibrator;

    const-wide/16 v3, 0x5

    invoke-virtual {v2, v3, v4}, Landroid/os/Vibrator;->vibrate(J)V

    iput-wide v0, p0, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/げつ〴ぬぐ;->なぎぱいぢぎ:J

    :cond_23
    return-void
.end method
