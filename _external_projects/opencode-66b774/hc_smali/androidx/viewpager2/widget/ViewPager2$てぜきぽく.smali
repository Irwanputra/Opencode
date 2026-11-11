.class public Landroidx/viewpager2/widget/ViewPager2$てぜきぽく;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/viewpager2/widget/ViewPager2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u3066\u305c\u304d\u307d\u304f"
.end annotation


# instance fields
.field public final 〺つふすそ:I

.field public final くし〴〺ぅ:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method public constructor <init>(ILandroidx/recyclerview/widget/RecyclerView;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Landroidx/viewpager2/widget/ViewPager2$てぜきぽく;->〺つふすそ:I

    iput-object p2, p0, Landroidx/viewpager2/widget/ViewPager2$てぜきぽく;->くし〴〺ぅ:Landroidx/recyclerview/widget/RecyclerView;

    return-void
.end method


# virtual methods
.method public run()V
    .registers 3

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2$てぜきぽく;->くし〴〺ぅ:Landroidx/recyclerview/widget/RecyclerView;

    iget v1, p0, Landroidx/viewpager2/widget/ViewPager2$てぜきぽく;->〺つふすそ:I

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->びちづぼぬ(I)V

    return-void
.end method
